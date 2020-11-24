package com.gift.marsinsightweather.di

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.gift.marsinsightweather.data.local.AppDatabase
import com.gift.marsinsightweather.data.local.SolDao
import com.gift.marsinsightweather.data.remote.SolRemoteDataSource
import com.gift.marsinsightweather.data.remote.SolService
import com.gift.marsinsightweather.data.repository.SolRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson) : Retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    fun provideSolService(retrofit: Retrofit): SolService = retrofit.create(SolService::class.java)

    @Singleton
    @Provides
    fun provideSolRemoteDataSource(solService: SolService) = SolRemoteDataSource(solService)

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context) = AppDatabase.getDatabase(appContext)

    @Singleton
    @Provides
    fun provideSolDao(db: AppDatabase) = db.solDao()

    @Singleton
    @Provides
    fun provideRepository(remoteDataSource: SolRemoteDataSource,
                          localDataSource: SolDao) =
        SolRepository(remoteDataSource, localDataSource)
}