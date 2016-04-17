package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sines);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void sines(View view){
        Intent sines = new Intent(this,sines.class);
        startActivity(sines);
    }
}
