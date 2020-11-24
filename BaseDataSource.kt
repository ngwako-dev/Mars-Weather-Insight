package com.gift.marsinsightweather.data.remote


import com.bumptech.glide.load.engine.Resource
import com.gift.marsinsightweather.utils.Resource.Companion.error
import retrofit2.Response
import retrofit2.Response.error
import timber.log.Timber
import kotlin.Result.Companion.success

abstract class BaseDataSource {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Resource<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return Resource.success(body)
            }
            return error(" ${response.code()} ${response.message()}")
        } catch (e: Exception) {
            return error(e.message ?: e.toString())
        }
    }

    private fun <T> error(message: String): Resource<T> {
        Timber.d(message)
        return Resource.error("")
    }
}