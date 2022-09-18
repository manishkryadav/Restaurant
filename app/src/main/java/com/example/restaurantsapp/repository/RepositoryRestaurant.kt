package com.example.restaurantsapp.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.restaurantsapp.model.RestaurantData
import com.example.restaurantsapp.network.Apis
import com.example.restaurantsapp.network.NetworkUtils

class RepositoryRestaurant (
        private val apiService: Apis,
        private val applicationContext: Context
    ) {

        private val restaurantLiveData = MutableLiveData<RestaurantData>()

        val rastaurant: LiveData<RestaurantData>
            get() = restaurantLiveData

        suspend fun getRestaurant(terms: String,location: String,radius: Int,sortBy: String,limit: Int){

            if(NetworkUtils.isInternetAvailable(applicationContext)){
                val result = apiService.getRestaurant(terms,location,radius,sortBy,limit)
                if(result?.body() != null){
//                    quoteDatabase.quoteDao().addQuotes(result.body()!!.results)
                    restaurantLiveData.postValue(result.body())
                }
            }
            else{
            }

        }
}