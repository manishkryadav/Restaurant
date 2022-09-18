package com.example.restaurantsapp.network


import com.example.restaurantsapp.model.RestaurantData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Apis {
    @Headers(
//        "Api-Version: v1",
//        "Accept: application/json",
        "Authorization: Bearer XPFgzKwZGK1yqRxHi0d5xsARFOLpXIvccQj5jekqTnysweGyoIfVUHcH2tPfGq5Oc9kwKHPkcOjk2d1Xobn7aTjOFeop8x41IUfVvg2Y27KiINjYPADcE7Qza0RkX3Yx",
//        "Content-Type: application/json-patch+json"

    )
    @GET("/v3/businesses/search")
    suspend fun getRestaurant(@Query("term") terms: String,@Query("location") location: String,@Query("radius") radius: Int,@Query("sort_by") sortBy: String,@Query("limit") limit: Int ) : Response<RestaurantData>
}