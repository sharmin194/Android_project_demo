package com.sharmin.mydemoapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button newQuoteButton;
    private String[] quotes; // Array to store quotes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        quoteTextView = findViewById(R.id.quoteTextView);
        newQuoteButton = findViewById(R.id.newQuoteButton);

        // Initialize the quotes array with some sample quotes
        quotes = new String[]{
                "The best among you are those who have the best manners and character. - Prophet Muhammad (PBUH)",
                "And whoever puts their trust in Allah, then He will suffice him. - Quran 65:3",
                "So be patient. Indeed, the promise of Allah is truth. - Quran 30:60",
                "Allah does not burden a soul beyond that it can bear. - Quran 2:286",
                "Be mindful of Allah, and Allah will protect you. - Hadith",
                "Indeed, Allah is with the patient. - Quran 2:153",
                "Do not lose hope, nor be sad. - Quran 3:139",
                "And the Hereafter is better for you than the first life. - Quran 93:4"
        };

        // Set up button click listener
        newQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get a random quote
                String randomQuote = getRandomQuote();
                // Display the quote
                quoteTextView.setText(randomQuote);
                // Display a toast message
                Toast.makeText(MainActivity.this, "New quote displayed!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Method to get a random quote from the quotes array
    private String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }
}
