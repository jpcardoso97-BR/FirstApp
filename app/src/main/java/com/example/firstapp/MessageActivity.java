package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    private TextView messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        messageText = findViewById(R.id.messageTextView);

        //Recuperando a intent
        Intent intent = getIntent();

        //Recuperando o texto da intent
        String text = intent.getStringExtra("Message");

        //Alterando o textView
        messageText.setText(text);
    }
}
