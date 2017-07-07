package com.example.marcel.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText cal, sod, pot, pro, fib, grams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         cal = (EditText) findViewById(R.id.cal);
         sod = (EditText) findViewById(R.id.sod);
         pot = (EditText) findViewById(R.id.pot);
         pro = (EditText) findViewById(R.id.pro);
         fib = (EditText) findViewById(R.id.fib);
         grams = (EditText) findViewById(R.id.grams);
    }

    public void calculate(View v){
    }

    public void plusOne(View v){
        double gram = Double.parseDouble(grams.getText().toString());
        grams.setText("" + (gram + 1));
    }

    public void minusOne(View v){
        double gram = Double.parseDouble(grams.getText().toString());
        grams.setText("" + (gram - 1));
    }
}
