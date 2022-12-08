package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ImageButton dc = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton rcb = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton lsg = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton gt = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton csk = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton kkr = (ImageButton) findViewById(R.id.imageButton16);
        ImageButton mi = (ImageButton) findViewById(R.id.imageButton17);
        ImageButton pk = (ImageButton) findViewById(R.id.imageButton18);
        ImageButton rr = (ImageButton) findViewById(R.id.imageButton19);
        ImageButton srh = (ImageButton) findViewById(R.id.imageButton20);
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(intent01);
            }
        });
        rcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity8.class);
                startActivity(intent01);
            }
        });
        lsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity9.class);
                startActivity(intent01);
            }
        });
        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity10.class);
                startActivity(intent01);
            }
        });
        csk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity11.class);
                startActivity(intent01);
            }
        });
        kkr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity12.class);
                startActivity(intent01);
            }
        });
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity13.class);
                startActivity(intent01);
            }
        });
        pk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity14.class);
                startActivity(intent01);
            }
        });
        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity15.class);
                startActivity(intent01);
            }
        });
        srh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(MainActivity6.this,MainActivity16.class);
                startActivity(intent01);
            }
        });

    }
}