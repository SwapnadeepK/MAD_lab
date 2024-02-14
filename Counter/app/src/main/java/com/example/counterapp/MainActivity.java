package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnstart, btnstop;
    TextView textcounter;
    Handler customHandler= new Handler();
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textcounter=findViewById(R.id.counter);
        btnstart=findViewById(R.id.btnstart);
        btnstop=findViewById(R.id.btnstop);
        btnstart.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                customHandler.postDelayed(updateTimer,   0);
            }
        });

        btnstop.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                customHandler.removeCallbacks(updateTimer);
            }
        });
    }

    private final Runnable updateTimer=new Runnable(){
        public void run(){
            textcounter.setText(" "+i);
            customHandler.postDelayed( this, 1000);
            i++;
        }
    };
}