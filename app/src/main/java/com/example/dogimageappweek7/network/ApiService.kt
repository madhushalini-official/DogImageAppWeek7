package com.example.dogimageappweek7.network

import com.example.dogimageappweek7.model.DogResponse
import retrofit2.http.GET

interface ApiService {
    @GET("breeds/image/random/10")
    suspend fun getDogImages(): DogResponse
}
