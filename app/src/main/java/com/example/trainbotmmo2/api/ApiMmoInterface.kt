package com.example.trainbotmmo2.api

import com.example.trainbotmmo2.model.detail.Games
import com.example.trainbotmmo2.model.list.ListGames
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiMmoInterface {

    @GET("/games")
    suspend fun getLiveGamesList(
    ): Call<List<Games>>
}