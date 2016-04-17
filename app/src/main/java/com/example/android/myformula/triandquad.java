package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class triandquad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triandquad);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void triandquad(View view){
        Intent triandquad = new Intent(this,triandquad.class);
        startActivity(triandquad);
    }
}
