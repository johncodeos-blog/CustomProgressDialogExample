package com.johncodeos.customprogressdialogexample

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val progressBar = CustomProgressBar()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_btn.setOnClickListener {
            // Show progress bar
            progressBar.show(this,"Please Wait...")

            Handler().postDelayed({
                //Dismiss progress bar after 4 seconds
                progressBar.dialog.dismiss()
            }, 4000)
        }

    }

}
