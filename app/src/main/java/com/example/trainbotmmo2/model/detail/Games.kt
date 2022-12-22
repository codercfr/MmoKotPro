package com.example.trainbotmmo2.model.detail

import com.example.trainbotmmo2.model.Platforms
import java.util.Date

data class Games(
    val id:Int,
    val title:String,
    //val thumbnail:Photo,
    val short_description:String,
    val game_url:String,
    val genre:String,
    val platforms: String,
    val publisher:String,
    val developper:String,
    val releaseDate:Date,
    val profile_url:String,
)
