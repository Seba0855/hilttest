package com.example.hilttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(res: Int, attachToRoot: Boolean = false): View =
    LayoutInflater.from(context).inflate(res, this, attachToRoot)
