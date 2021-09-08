package com.example.androidmobilebootcampsecondweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class WordTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_test)

        val titleButton: Button = findViewById(R.id.button2)

        val cardViewText1: TextView = findViewById(R.id.textView1)
        val cardViewText2: TextView = findViewById(R.id.textView2)
        val cardViewText3: TextView = findViewById(R.id.textView3)
        val cardViewText4: TextView = findViewById(R.id.textView4)

        titleButton.text = intent.getStringExtra("string")

        cardViewText1.text = intent.getStringArrayExtra("string array")?.get(0)
        cardViewText2.text = intent.getStringArrayExtra("string array")?.get(1)
        cardViewText3.text = intent.getStringArrayExtra("string array")?.get(2)
        cardViewText4.text = intent.getStringArrayExtra("string array")?.get(3)

        var progressBar: ProgressBar = findViewById(R.id.progress_circular)
        var progressText: TextView = findViewById(R.id.countdown_time)
        var progr : Int

        var timer = object: CountDownTimer(20000, 1000){
            override fun onTick(timeLeft: Long) {
                progr = (timeLeft.toInt() / 1000)
                updateProgressBar(progressBar, progressText, progr)
            }

            override fun onFinish() {
                Toast.makeText(this@WordTestActivity, "Time is up", Toast.LENGTH_SHORT).show()
            }
        }

        timer.start()



    }

    private fun updateProgressBar(progressBar: ProgressBar, progressText: TextView, progr: Int){
        progressBar.progress = progr * 5
        progressText.text = "$progr"
    }

}