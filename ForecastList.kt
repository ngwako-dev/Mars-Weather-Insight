package com.gift.marsinsightweather.data.entities

import com.gift.marsinsightweather.data.entities.Forecast


data class ForecastList(
        val forecasts: List<Forecast>,
        val lastUpdated: String,
        val weatherStation: String
)