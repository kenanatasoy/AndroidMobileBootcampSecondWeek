package com.example.androidmobilebootcampsecondweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InitialWordTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial_word_test)


        supportFragmentManager.beginTransaction().apply{
            add(R.id.activity_initial_word_test, InitialWordTestFragment())
            commit()
        }
    }
}