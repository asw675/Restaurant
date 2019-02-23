package com.bignerdranch.android.restaurant

import com.bignerdranch.android.restaurant.Model.Menu
import com.bignerdranch.android.restaurant.Model.landing
import okhttp3.RequestBody
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import rx.Observable

interface MenuInterface {

    @GET("dishes")
    fun getMenu(

    ): Observable<Menu>

    @Multipart
    @POST("landing/")
    fun landing(
            @Part("user_id") username:RequestBody,
            @Part("password") password:RequestBody
    ):Observable<landing>
}