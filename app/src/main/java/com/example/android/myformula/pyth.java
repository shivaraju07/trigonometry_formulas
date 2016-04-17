package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pyth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pyth);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void pyth(View view){
        Intent pyth = new Intent(this,pyth.class);
        startActivity(pyth);
    }
}
