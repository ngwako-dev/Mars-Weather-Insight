package com.example.marsweather.Model

import com.example.marsweather.Model.*

data class Weather(
        var `697`: X697,
        var `698`: X698,
        var `699`: X699,
        var `700`: X700,
        var `701`: X701,
        var `703`: X703,
        var sol_keys: List<String>
)
data class X697(
        var First_UTC: String,
        var Last_UTC: String,
        var PRE: PRE,
        var Season: String,
        var WD: WD
)
data class X698(
        var AT: AT,
        var First_UTC: String,
        var HWS: HWS,
        var Last_UTC: String,
        var PRE: PREX,
        var Season: String,
        var WD: WDX
)
data class X699(
        var AT: AT,
        var First_UTC: String,
        var HWS: HWS,
        var Last_UTC: String,
        var PRE: PREXX,
        var Season: String,
        var WD: WDXX
)
data class X700(
        var AT: ATXX,
        var First_UTC: String,
        var HWS: HWSXX,
        var Last_UTC: String,
        var PRE: PREXXX,
        var Season: String,
        var WD: WDXXX
)
data class X701(
        var First_UTC: String,
        var Last_UTC: String,
        var PRE: PREXXXX,
        var Season: String,
        var WD: WDXXXX
)
data class X703(
        var AT: ATXXX,
        var First_UTC: String,
        var HWS: HWSXXX,
        var Last_UTC: String,
        var PRE: PREXXXXX,
        var Season: String,
        var WD: WDXXXXX
)
data class AT(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class ATX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class ATXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class ATXXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class HWS(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class HWSX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class HWSXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class HWSXXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class MostCommon(
        var compass_degrees: Int,
        var compass_point: String,
        var compass_right: Int,
        var compass_up: Int,
        var ct: Int
)
data class MostCommonX(
        var compass_degrees: Double,
        var compass_point: String,
        var compass_right: Double,
        var compass_up: Double,
        var ct: Int
)

data class MostCommonXX(
        var compass_degrees: Double,
        var compass_point: String,
        var compass_right: Double,
        var compass_up: Double,
        var ct: Int
)
data class MostCommonXXX(
        var compass_degrees: Int,
        var compass_point: String,
        var compass_right: Int,
        var compass_up: Int,
        var ct: Int
)
data class PRE(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class PREX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class PREXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class PREXXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class PREXXXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class PREXXXXX(
        var av: Double,
        var ct: Int,
        var mn: Double,
        var mx: Double
)
data class WD(
        var most_common: Any
)
data class WDX(
        var most_common: MostCommon
)
data class WDXX(
        var most_common: MostCommonX
)
data class WDXXX(
        var most_common: MostCommonXX
)
data class WDXXXX(
        var most_common: Any
)
data class WDXXXXX(
        var most_common: MostCommonXXX
)