package com.example.myapplication.model.retrofit

import com.example.myapplication.model.data.Forecast
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


class RetrofitClient{
    val BASE_URL ="https://run.mocky.io/"
    val retrofitService by lazy {
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(RetrofitService::class.java)
    }
}
 interface RetrofitService {
    @GET("4cb24bc8-a8ec-4736-ba4b-2284e40dad00")
    suspend fun getMarsData(): Forecast
}