package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Comment

class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating)

        // Initialize views
        val textView = findViewById<TextView>(R.id.textView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)

        val ratings = intent.getStringArrayExtra("ratings")
        val comments = intent.getStringArrayExtra("comments")


        // Display the ratings and comments
        if (ratings != null && comments != null) {
            val rating = ratings[0]
            val comment = comments[0]
            textView.text = "Rating: $rating"
            "Comment: $comment"
        }
        else {
            textView.text = "No ratings yet"
        }




        textView.text = "Your Rating"
       reviewButton.text = "Review"


            // Set click listeners for buttons
            reviewButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)



            }
    }
}