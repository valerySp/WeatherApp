package com.example.weatherapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.fragment.MainFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutInflater = LayoutInflater.from(this)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.getRoot())

        supportFragmentManager.beginTransaction().replace(R.id.placeHolder,MainFragment.newInstance()).commit()


    }
}