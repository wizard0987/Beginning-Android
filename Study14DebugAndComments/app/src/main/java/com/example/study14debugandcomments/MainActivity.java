package com.example.study14debugandcomments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String easy = "vvon";

        Log.e("MainActivity : ", easy); // e : error

        // 주석1
        int a = 10;

        /*
        * d : Debug
        * a : Assert
        */
        Log.e("MainActivity : ", String.valueOf(a));
    }
}