package com.example.marsweather.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.marsweather.Utils.RetrofitRepository
//import com.example.marsweather.Utils.RetrofitRepository
import kotlinx.coroutines.Dispatchers

class HomeViewModel : ViewModel() {
     private val retrofitRepository: RetrofitRepository = RetrofitRepository()

      val data = liveData(Dispatchers.IO) {
          val marsData = retrofitRepository.getData()
          emit(marsData)

      }
}