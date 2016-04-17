package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class moll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moll);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void moll(View view){
        Intent moll = new Intent(this,moll.class);
        startActivity(moll);
    }
}
