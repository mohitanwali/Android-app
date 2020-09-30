package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void onBtnClick(View view) {
        Intent i = new Intent(getApplicationContext(), AddNewPostActivity.class);

        startActivity(i);


    }
    public void onBtnContactUsClick(View view) {
        Intent i = new Intent(getApplicationContext(), ContactUsActivity.class);

        startActivity(i);


    }
}