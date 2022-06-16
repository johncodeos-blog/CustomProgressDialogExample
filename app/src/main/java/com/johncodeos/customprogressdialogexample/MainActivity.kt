package com.johncodeos.customprogressdialogexample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val progressDialog by lazy { CustomProgressDialog(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.start_btn)
        startButton.setOnClickListener {
            // Show progress dialog
            progressDialog.start("Please Wait...")

            Handler(Looper.getMainLooper()).postDelayed({
                // Dismiss progress bar after 4 seconds
                progressDialog.stop()
            }, 4000)
        }
    }
}
