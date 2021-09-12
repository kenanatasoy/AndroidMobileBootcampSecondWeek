package com.example.androidmobilebootcampsecondweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidmobilebootcampsecondweek.fragments.InitialWordTestFragment
import com.example.androidmobilebootcampsecondweek.utils.startTransaction

class InitialWordTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial_word_test)



        supportFragmentManager.startTransaction {
            add(R.id.activity_initial_word_test, InitialWordTestFragment())
        } // call to the extension function for placing fragments in activities

    }
}