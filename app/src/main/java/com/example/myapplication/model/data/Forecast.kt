package com.example.myapplication.model.data

import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("date")
    var date: String,
    @SerializedName("humidity")
    var humidity: Int,
    @SerializedName("safe")
    var safe: Boolean,
    @SerializedName("temp")
    var temp: Int,
    @SerializedName("windSpeed")
    var windSpeed: Int
)