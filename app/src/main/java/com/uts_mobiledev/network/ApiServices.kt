package com.uts_mobiledev.network

import android.provider.ContactsContract
import com.uts_mobiledev.response.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST
import retrofit2.http.FormUrlEncoded


interface ApiServices{

    @FormUrlEncoded
    @POST("login")
    fun userLogin(
        @Field("email") email: String,
        @Field("password") password:String
    ):Call<LoginResponse>


}

