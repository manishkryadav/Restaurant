package com.example.restaurantsapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantsapp.model.RestaurantData
import com.example.restaurantsapp.repository.RepositoryRestaurant
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: RepositoryRestaurant) :ViewModel(){
    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getRestaurant("restaurants","NYC",500,"distance",15)
        }

    }

    val quoet: LiveData<RestaurantData>
        get() =repository.rastaurant
}