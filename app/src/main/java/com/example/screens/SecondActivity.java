package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView enetta;

        enetta = findViewById(R.id.textView2);
        Bundle extras = getIntent().getExtras();

        enetta.setText(getIntent().getStringExtra("number"));
    }
}