package com.uts_mobiledev.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

 class InitRetrofit {
    // URL Server API
    var API_URL = "https://pos-mobdev.herokuapp.com/api/login"

    fun setInit(): Retrofit {
        return Retrofit.Builder().baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val instance: ApiServices?
        get() = setInit().create(ApiServices::class.java)
}