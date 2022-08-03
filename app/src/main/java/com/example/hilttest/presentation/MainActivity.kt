package com.example.hilttest.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilttest.R
import com.example.hilttest.di.Bolek
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}