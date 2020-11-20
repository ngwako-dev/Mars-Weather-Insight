package com.example.myapplication.model.retrofit

import android.provider.ContactsContract
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


class RetrofitClient{
    val BASE_URL ="https://api.nasa.gov/"
    val retrofitService by lazy {
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(RetrofitService::class.java)
    }
}
 interface RetrofitService {
    @GET("insight_weather/?api_key=W1mGbLHETYWSrag3piW2i5PxoQxmaxv0wPC9Vg8E&feedtype=json&ver=1.0")
    suspend fun getMarsData(): ContactsContract.Contacts.Data
}