package com.example.microsoft.elroyyehezkiels_1202150044_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splashscreen extends AppCompatActivity {
    private static int splashInterval = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu = new Intent(splashscreen.this, MainActivity.class);
                startActivity(menu);
                finish();
            }
        }, 2500L); //5000 L = 5 detik
    }
}