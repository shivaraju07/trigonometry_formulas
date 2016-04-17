package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class unit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void unit(View view){
        Intent unit = new Intent(this,unit.class);
        startActivity(unit);
    }
}
