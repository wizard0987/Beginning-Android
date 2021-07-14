package com.example.study03intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub.findViewById(R.id.tv_sub);

        Intent intent = getIntent(); // 어디선가 날라오는 Intent가 존재한다면 해당 객체에서 받는다
        String str = intent.getStringExtra("str");

        tv_sub.setText(str);

    }
}