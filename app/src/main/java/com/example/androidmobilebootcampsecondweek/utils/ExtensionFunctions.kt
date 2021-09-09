package com.example.androidmobilebootcampsecondweek.utils

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

inline fun<reified T : AppCompatActivity> Context.startActivity(block : Intent.() -> Unit = {}){
    val intent  = Intent(this , T::class.java)
    startActivity(
        intent.also {
            block.invoke(it)
        }
    )
}

inline fun FragmentManager.startTransaction(func: FragmentTransaction.() -> Unit) {
    val fragmentTransaction = beginTransaction()
    fragmentTransaction.func()
    fragmentTransaction.commit()
    // definition of extension function for placing fragments in activities
}
