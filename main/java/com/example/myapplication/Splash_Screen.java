package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getSupportActionBar().hide(); //<< this
        setContentView( R.layout.activity_splash__screen );
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5500);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash_Screen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();



    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);
    }
}
