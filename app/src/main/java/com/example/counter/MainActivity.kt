package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.counter.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // New comments
        textView = findViewById(R.id.textView)

    }
    private lateinit var textView: TextView

    fun count_me(view: View) {
        val countString = textView.text.toString()
        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        // Display the new value in the text view.
        textView.text = count.toString();
        //comment12

    }
}
