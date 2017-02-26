package com.android.fauziachmadharuna.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class HomeActivity extends AppCompatActivity {
private final int SPLASH_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(HomeActivity.this, MainActivity.class);
                HomeActivity.this.startActivity(homeIntent);
                HomeActivity.this.finish();
            }
        },SPLASH_TIME_OUT);
    }
}
