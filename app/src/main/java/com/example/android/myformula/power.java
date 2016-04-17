package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class power extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.power);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void power(View view){
        Intent power = new Intent(this,power.class);
        startActivity(power);
    }
}
