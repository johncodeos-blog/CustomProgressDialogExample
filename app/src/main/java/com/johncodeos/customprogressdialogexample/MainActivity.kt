package com.johncodeos.customprogressdialogexample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val progressDialog = CustomProgressDialog()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_btn.setOnClickListener {
            // Show progress dialog
            progressDialog.show(this, "Please Wait...")

            Handler(Looper.getMainLooper()).postDelayed({
                // Dismiss progress bar after 4 seconds
                progressDialog.dialog.dismiss()
            }, 4000)
        }
    }
}
