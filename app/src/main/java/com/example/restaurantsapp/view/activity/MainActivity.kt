package com.example.restaurantsapp.view.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.restaurantsapp.MainApplication
import com.example.restaurantsapp.R
import com.example.restaurantsapp.repository.RepositoryRestaurant
import com.example.restaurantsapp.viewmodel.MainViewModel
import com.example.restaurantsapp.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val quoteRepository=(application as MainApplication).quoteRepository

        mainViewModel= ViewModelProvider(this, MainViewModelFactory(quoteRepository)).get(MainViewModel::class.java)
        mainViewModel.quoet.observe(this, Observer {
            Toast.makeText(this@MainActivity, it.businesses.size.toString(), Toast.LENGTH_SHORT).show()
        })

    }
}