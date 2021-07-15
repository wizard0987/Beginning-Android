package com.example.study15threadandhandler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_start, btn_stop;
    Thread thread;
    boolean isThread = false;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            //super.handleMessage(msg);
            Toast.makeText(
                    getApplicationContext(),
                    "Beginning Android",
                    Toast.LENGTH_SHORT)
                    .show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 스레드 시작
        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(v -> {

            isThread = true;
            thread = new Thread() {
                public void run() {
                    while(isThread) {
                        try {
                            sleep(3000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        handler.sendEmptyMessage(0);
}
                }
            };
            thread.start();

        });

        // 스레드 종료
        btn_stop  = findViewById(R.id.btn_stop);
        btn_stop.setOnClickListener(v -> {
            isThread = false;

        });

    }
}