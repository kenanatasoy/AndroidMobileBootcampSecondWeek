package com.example.androidmobilebootcampsecondweek.utils

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

inline fun<reified T : AppCompatActivity> Context.startActivity(block : Intent.() -> Unit = {}){

    val intent  = Intent(this , T::class.java)
    startActivity(
        intent.also {
            block.invoke(it)
        }
    )
}
