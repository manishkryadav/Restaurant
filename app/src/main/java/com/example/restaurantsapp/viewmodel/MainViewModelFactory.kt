package com.example.restaurantsapp.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.example.restaurantsapp.repository.RepositoryRestaurant

class MainViewModelFactory(private val repository: RepositoryRestaurant) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}