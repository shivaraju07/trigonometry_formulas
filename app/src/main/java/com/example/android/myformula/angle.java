package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class angle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void angle(View view){
        Intent angle = new Intent(this,angle.class);
        startActivity(angle);
    }
}
