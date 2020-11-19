package com.example.marsweather.Utils

class RetrofitRepository {
    var retrofitClient : RetrofitService = RetrofitClient().retrofitService
    suspend fun getData() = retrofitClient.getMarsData()
}