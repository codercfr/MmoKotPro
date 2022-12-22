package com.example.trainbotmmo2

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.lifecycleScope
import com.example.trainbotmmo2.api.ApiMmoInterface
import com.example.trainbotmmo2.api.RetrofitClient
import com.example.trainbotmmo2.databinding.ActivityMainBinding
import com.example.trainbotmmo2.model.detail.Games

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getTheMmoList()
        }

    private fun getTheMmoList(){
        lifecycleScope.launchWhenCreated {
            val response=try {
                RetrofitClient.autocompleteApi.getLiveGamesList()
            }catch (exception:java.lang.Exception){
                Log.e(ContentValues.TAG, "IOException, you might have internet connection" + exception.message)
                return@launchWhenCreated
            }
        }

    }
}