package com.example.calculator1;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {


   EditText e1,e2;
   TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         e1 = (EditText) findViewById(R.id.editTextTextPersonName);
         e2 = (EditText) findViewById(R.id.editTextTextPersonName2);
         t1 = (TextView) findViewById(R.id.textView2);

    }

        public void doAdd(View V)
    {
        
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());

        int res = a1+a2;
        t1.setText(" "+res);

    }

    public void doMinus(View V)
    {

        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());

        int res = a1-a2;
        t1.setText(" "+res);

    }

    public void doMul(View V)
    {

        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());

        int res = a1*a2;
        t1.setText(" "+res);

    }

    public void doDiv(View V)
    {

        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());

        int res = a1/a2;
        t1.setText(" "+res);

    }



}