package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cosines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cosines);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void cosines(View view){
        Intent cosines = new Intent(this,cosines.class);
        startActivity(cosines);
    }
}
