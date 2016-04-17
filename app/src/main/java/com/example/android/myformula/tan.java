package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void tan(View view){
        Intent tan = new Intent(this,tan.class);
        startActivity(tan);
    }
}
