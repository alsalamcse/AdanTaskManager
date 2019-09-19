package com.example.adantaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent i=new Intent(getApplication(),SignInActivity.class);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
    }
}