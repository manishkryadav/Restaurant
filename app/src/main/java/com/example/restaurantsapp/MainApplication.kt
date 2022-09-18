package com.example.restaurantsapp

import android.app.Application
import com.example.restaurantsapp.network.Apis
import com.example.restaurantsapp.network.RetrofitClient
import com.example.restaurantsapp.repository.RepositoryRestaurant

class MainApplication : Application() {

    lateinit var quoteRepository: RepositoryRestaurant

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val quoteService = RetrofitClient.getInstance().create(Apis::class.java)
        quoteRepository = RepositoryRestaurant(quoteService,applicationContext)
    }
}