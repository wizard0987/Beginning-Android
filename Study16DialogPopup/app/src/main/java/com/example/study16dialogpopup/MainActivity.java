package com.example.study16dialogpopup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_dialog;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dialog = findViewById(R.id.btn_dialod);
        tv_result  = findViewById(R.id.tv_result);

        btn_dialog.setOnClickListener(v -> {
            AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
            ad.setIcon(R.mipmap.ic_launcher);
            ad.setTitle("제목");
            ad.setMessage("Beginning Android?");

            final EditText et = new EditText(MainActivity.this); // final :
            ad.setView(et); // EditText를 AlertDialog에 추가한다.

            // 확인 버튼
            ad.setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String result = et.getText().toString();
                    tv_result.setText(result);
                    dialog.dismiss();   // 현재 올라운 Dialog는 닫는다.
                }
            });

            // 취소 버튼
            ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();   // 현재 올라운 Dialog는 닫는다.
                }
            });

            ad.show();

        });

    }
}