package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class double1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.double1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void double1(View view){
        Intent double1 = new Intent(this,double1.class);
        startActivity(double1);
    }
}
