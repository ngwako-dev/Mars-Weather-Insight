package com.gift.marsinsightweather.ui.soldetail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.gift.marsinsightweather.data.entities.Forecast
import com.gift.marsinsightweather.data.repository.SolRepository
import com.gift.marsinsightweather.utils.Resource

class SolDetailViewModel @ViewModelInject constructor(
    private val repository: SolRepository
) : ViewModel() {

    private val _id = MutableLiveData<Int>()

    private val _solDetails = _id.switchMap { id ->
        repository.getSol(id)
    }
    val solDetails: LiveData<Resource<Forecast>> = _solDetails


    fun start(id: Int) {
        _id.value = id
    }

}