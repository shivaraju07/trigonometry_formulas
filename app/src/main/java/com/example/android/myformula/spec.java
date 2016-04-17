package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class spec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spec);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void spec(View view){
        Intent spec = new Intent(this,spec.class);
        startActivity(spec);
    }
}
