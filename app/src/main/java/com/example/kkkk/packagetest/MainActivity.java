package com.example.kkkk.packagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.librarytest.CashUtils.Cents2Long;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long result = Cents2Long(32.32);
    }
}
