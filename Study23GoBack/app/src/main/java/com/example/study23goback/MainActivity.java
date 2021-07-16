package com.example.study23goback;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private long backBtnTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        long currentTime = System.currentTimeMillis();
        long gapTime     = currentTime - backBtnTime;

        if((gapTime >= 0) && (gapTime <= 2000)) {
            super.onBackPressed();
        } else {
            backBtnTime = currentTime;
            Toast.makeText(
                    MainActivity.this,
                    "한번 더 뒤로가기 누르시면 종료됩니다.",
                    Toast.LENGTH_SHORT
                    )
                .show();
       }
    }
}