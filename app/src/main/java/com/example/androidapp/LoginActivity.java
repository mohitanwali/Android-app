package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onBtnClick(View view) {
        Intent i = new Intent(getApplicationContext(), SignupPageActivity.class);

        startActivity(i);


    }
    public void onBtnLoginClick(View view) {
        Intent j = new Intent(getApplicationContext(), DashboardActivity.class);

        startActivity(j);


    }


}
