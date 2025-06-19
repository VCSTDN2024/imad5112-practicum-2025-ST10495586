package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("UNUSED_EXPRESSION")
class PlaylistActivity : AppCompatActivity() {

    private lateinit var displayTextView: TextView
    private lateinit var playlistButton: Button
    private lateinit var nextButton: Button
    private lateinit var exitButton: Button
    private lateinit var ratingTextView: TextView
    private lateinit var commentsTextView: TextView


    companion object {
        val songs = arrayOf(
            "Peace Hardly",
            "Fine By Me",
            "Is This Love",
            "I Just Died"
        )


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_playlist)


        displayTextView.text = "Your Music Playlist"
        playlistButton.text = "Add To Playlist"
        nextButton.text = "Next"
        exitButton.text = "Exit"
        ratingTextView.text = "Rate (1-5)"
        commentsTextView.text = "Enter Your Thoughts"


        // Set click listeners for buttons

        playlistButton.setOnClickListener {
            displayTextView.text = "Peace Hardly"
            "Fine By Me"
            "Is This Love"
            "I Just Died"

        }

        ratingTextView.setOnClickListener {
            when (displayTextView.text) {
                "Peace Hardly" -> ratingTextView.text = "5"
                "Fine By Me" -> ratingTextView.text = "4"
                "Is This Love" -> ratingTextView.text = "3"
                "I Just Died" -> ratingTextView.text = "2"
            }

        }




        nextButton.setOnClickListener {
            val intent = Intent(this, RatingActivity::class.java)
            startActivity(intent)
            displaySong()
        }


        exitButton.setOnClickListener {
            finish()
        }


    }

    private fun displaySong() {

    }

    private fun songs.shuffle() {


    }
}

