package com.example.android.myformula;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


public class tri extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tri);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void tri(View view){
        Intent tri = new Intent(this,tri.class);
        startActivity(tri);
    }

    }
