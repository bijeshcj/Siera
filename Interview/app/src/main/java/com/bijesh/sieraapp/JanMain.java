package com.bijesh.sieraapp;

import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JanMain extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i =0;i<10;i++){
            final int val = i;
            new Handler().postAtFrontOfQueue(new Runnable() {
                @Override
                public void run() {
System.out.println(val);
                }
            });
        }
    }
}
