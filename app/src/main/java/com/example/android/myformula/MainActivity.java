package com.example.android.myformula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void angle(View view) {
        Intent angle = new Intent(this, angle.class);
        startActivity(angle);
    }

    public void conf(View view) {
        Intent conf = new Intent(this, conf.class);
        startActivity(conf);
    }

    public void cosines(View view) {
        Intent cosines = new Intent(this, cosines.class);
        startActivity(cosines);
    }

    public void double1(View view) {
        Intent double1 = new Intent(this, double1.class);
        startActivity(double1);
    }

    public void half(View view) {
        Intent half = new Intent(this, half.class);
        startActivity(half);
    }

    public void moll(View view) {
        Intent moll = new Intent(this, moll.class);
        startActivity(moll);
    }

    public void power(View view) {
        Intent power = new Intent(this, power.class);
        startActivity(power);
    }

    public void pyth(View view) {
        Intent pyth = new Intent(this, pyth.class);
        startActivity(pyth);
    }

    public void sines(View view) {
        Intent sines = new Intent(this, sines.class);
        startActivity(sines);
    }

    public void spec(View view) {
        Intent spec = new Intent(this, spec.class);
        startActivity(spec);
    }

    public void tan(View view) {
        Intent tan = new Intent(this, tan.class);
        startActivity(tan);
    }

    public void tri(View view) {
        Intent tri = new Intent(this, tri.class);
        startActivity(tri);
    }

    public void triandquad(View view) {
        Intent triandquad = new Intent(this, triandquad.class);
        startActivity(triandquad);
    }

    public void unit(View view) {
        Intent unit = new Intent(this, unit.class);
        startActivity(unit);
    }
}