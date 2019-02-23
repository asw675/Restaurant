package com.bignerdranch.android.restaurant.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.bignerdranch.android.restaurant.MenuInterface
import com.bignerdranch.android.restaurant.Model.land
import com.bignerdranch.android.restaurant.R
import kotlinx.android.synthetic.main.activity_landing.*
import okhttp3.MediaType
import okhttp3.RequestBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers



class LandingActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        initView()
    }

    fun initView()
    {

        landing.setOnClickListener {
            val retrofit= Retrofit.Builder()
                    .baseUrl("http://120.78.174.70:8000/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build()

            val retrofitInterface=retrofit.create(MenuInterface::class.java)
            var land= land()
            land.user_id=userid.text.toString().toInt()
            land.password=password.text.toString()
            val userid = RequestBody.create(MediaType.parse("text/plain"), userid.text.toString())
            val password = RequestBody.create(MediaType.parse("text/plain"), password.text.toString())
            retrofitInterface.landing(userid,password)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        result->
                        if (result.code.equals(1000))
                        {
                            Toast.makeText(this,"g0",Toast.LENGTH_SHORT).show()
                        }
                        else
                        {
                            Toast.makeText(this,"g1",Toast.LENGTH_SHORT).show()
                        }
                    },
                    {
                        error->Toast.makeText(this,error.toString(),Toast.LENGTH_SHORT).show()

                    })
        }
    }
}