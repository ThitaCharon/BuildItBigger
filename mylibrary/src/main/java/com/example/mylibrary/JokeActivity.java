package com.example.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

         String myJoke = getIntent().getStringExtra("joke");
         Toast.makeText(this, myJoke, Toast.LENGTH_SHORT).show();


    }
}