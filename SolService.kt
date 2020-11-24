package com.gift.marsinsightweather.data.remote

import com.gift.marsinsightweather.data.entities.Forecast
import com.gift.marsinsightweather.data.entities.ForecastList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


//https://run.mocky.io/v3/04dc1be1-8609-48c9-b4a0-27a363aa22a9
interface SolService {
    @GET("v3/04dc1be1-8609-48c9-b4a0-27a363aa22a9")
    suspend fun getAllSols() : Response<ForecastList>

    @GET("api/character/{id}")
    suspend fun getSol(@Path("id") id: Int): Response<Forecast>
}