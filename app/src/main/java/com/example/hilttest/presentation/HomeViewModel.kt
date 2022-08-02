package com.example.hilttest.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hilttest.di.Bolek
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    @Bolek lateinit var chopek: String
) : ViewModel() {
    // TODO: Implement the ViewModel

    val liveData = MutableLiveData(chopek)

}