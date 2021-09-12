package com.example.androidmobilebootcampsecondweek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import com.example.androidmobilebootcampsecondweek.utils.startActivity

class SplashActivity : AppCompatActivity() {

    private val ONCREATEDELAY  :  Long = 3 * 1000

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity<InitialWordTestActivity>{

                }
                finish()
                // starting the splash activity on create and keeping it on the screen for 3 seconds
            }
        }, ONCREATEDELAY)

    }
}