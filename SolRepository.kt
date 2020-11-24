package com.gift.marsinsightweather.data.repository

import com.gift.marsinsightweather.data.local.SolDao
import com.gift.marsinsightweather.data.remote.SolRemoteDataSource
import com.gift.marsinsightweather.utils.performGetOperation
import javax.inject.Inject

class SolRepository @Inject constructor(
        private val remoteDataSource: SolRemoteDataSource,
        private val localDataSource: SolDao
) {

    fun getSol(id: Int) = performGetOperation(
        databaseQuery = { localDataSource.getSol(id) },
        networkCall = { remoteDataSource.getSol(id) },
        saveCallResult = { localDataSource.insert(it) }
    )

    fun getSols() = performGetOperation(
        databaseQuery = { localDataSource.getAllSols() },
        networkCall = { remoteDataSource.getSols() },
        saveCallResult = { localDataSource.insertAll(it.forecasts) }
    )
}