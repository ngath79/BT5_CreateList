package com.google.bt5_createlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview;
        ArrayList<MonAn> arrayList;
        Adapter adapter;

        listview = findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("Tokbokki lẩu Hàn Quốc", "Đơn giá: 130.000 VNĐ", R.drawable.tokbokki));
        arrayList.add(new MonAn("Kim chi Hàn Quốc", "Đơn giá: 500.000 VNĐ", R.drawable.kimchi));
        arrayList.add(new MonAn("Gà rán KFC", "Đơn giá: 30.000 VNĐ", R.drawable.garan));
        arrayList.add(new MonAn("Kimbap", "Đơn giá: 10.000 VNĐ", R.drawable.kimbap));
        arrayList.add(new MonAn("Kim chi cuộn", "Đơn giá: 50.000 VNĐ", R.drawable.cuon));
        arrayList.add(new MonAn("Cá viên cuộn", "Đơn giá: 120.000 VNĐ", R.drawable.cavien));
        arrayList.add(new MonAn("Bibimbap ", "Đơn giá: 50.000 VNĐ", R.drawable.bibimbap));
        arrayList.add(new MonAn("Mì trộn Hàn Quốc ", "Đơn giá: 89.000 VNĐ", R.drawable.mitron));
        arrayList.add(new MonAn("Khoai tây lốc xoáy ", "Đơn giá: 39.000 VNĐ", R.drawable.dochien));


         adapter = new Adapter(MainActivity.this, R.layout.layoutitem, arrayList);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Detail.class);
                    startActivity(intent);
                }
            }
        });
    }
}