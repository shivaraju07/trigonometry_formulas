package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class half extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.half);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void half(View view){
        Intent half = new Intent(this,half.class);
        startActivity(half);
    }
}
