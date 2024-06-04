package com.example.lovecat.api

import com.example.lovecat.data.CatModel
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "live_T1y69jct42szkFWSvdKLq1ltrBvZbG2VpivVDGM7JXfmVmAYOOMDywx4uZDyA8CM"

interface CatService {
    @GET("v1/images/search?api_key=$API_KEY")
    suspend fun getImages(
        @Query("limit") num: Int = 1
    ): CatModel
}
