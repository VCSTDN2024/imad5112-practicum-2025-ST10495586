package com.example.musicplaylist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")

    //Asemahle Ngete
    //ST10495586
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize views
        val musicTextView = findViewById<TextView>(R.id.musicTextView)
        val startButton = findViewById<Button>(R.id.startButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        musicTextView.text = "Your Music Playlist"


        // Set click listeners for buttons
      startButton.setOnClickListener {
          val intent = Intent(this, PlaylistActivity::class.java)
          startActivity(intent)
      }

        exitButton.setOnClickListener {
            finish()
        }









    }
}