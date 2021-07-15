package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        /**
        * ArrayAdapter로 어뎁터를 생성합니다.
        * ArrayAdapter는 ListView에 보여줄 수 있는 가장 간단한 방법이다.
        * 생성자의 인자 값으로 Context, LayoutResource, List를 받는다.
        */
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("easyvvon");
        data.add("Android");
        data.add("Apple");
        adapter.notifyDataSetChanged(); // List에 추가한 데이터를 저장한다.
    }
}