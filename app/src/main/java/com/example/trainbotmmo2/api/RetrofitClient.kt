package com.example.trainbotmmo2.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private val autocompleteBaseUrl ="https://www.mmobomb.com/api1/games"

    val autocompleteApi: ApiMmoInterface by lazy {
        Retrofit.Builder()
            .baseUrl(autocompleteBaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiMmoInterface:: class.java)
    }
}