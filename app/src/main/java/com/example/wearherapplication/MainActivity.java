package com.example.wearherapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.wearherapplication.util.CityTest;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LitePal.getDatabase();
        getSupportActionBar().hide();
//        CityTest.getProvince();
//      CityTest.getCounty(28,28);
 //      CityTest.getCity(28);
    }
}