package com.example.hilttest.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hilttest.R
import com.example.hilttest.di.Bolek
import com.example.hilttest.di.Lolek
import com.example.hilttest.inflate
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment: Fragment() {
    private lateinit var viewModel: HomeViewModel
    @Inject @Bolek lateinit var bolek: String
    @Inject @Lolek lateinit var lolek: String
    @Inject lateinit var retrofit: Retrofit

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = container?.inflate(R.layout.fragment_home)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.bolek).text = bolek
        view.findViewById<TextView>(R.id.lolek).text = lolek

        Timber.e(retrofit.baseUrl().toString())
    }
}