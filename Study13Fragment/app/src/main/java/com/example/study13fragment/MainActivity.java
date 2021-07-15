package com.example.study13fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(v -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment1 fragment1 = new Fragment1();
            transaction.replace(R.id.frame, fragment1);
            transaction.commit(); // 저장 후 새로고침(?)
        });

        btn1.setOnClickListener(v -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment2 fragment2 = new Fragment2();
            transaction.replace(R.id.frame, fragment2);
            transaction.commit(); // 저장 후 새로고침(?)
        });

        btn1.setOnClickListener(v -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment3 fragment3 = new Fragment3();
            transaction.replace(R.id.frame, fragment3);
            transaction.commit(); // 저장 후 새로고침(?)
        });

        btn1.setOnClickListener(v -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment4 fragment4 = new Fragment4();
            transaction.replace(R.id.frame, fragment4);
            transaction.commit(); // 저장 후 새로고침(?)
        });

    }
}