package com.example.myapplication.model.data.solhours

import com.example.myapplication.model.data.AirTemperature
import com.example.myapplication.model.data.Pressure
import com.example.myapplication.model.data.WindSpeed

data class X700(

        var AT: AirTemperature,
        var First_UTC: String,
        var HWS: WindSpeed,
        var Last_UTC: String,
        var PRE: Pressure,
        var Season: String,

        )