package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity9 extends AppCompatActivity {
    hadingg o1 = new hadingg("KL Rahul",	"Wicket-keeper"	,"15 Crore");
    hadingg o2 = new hadingg("Marcus Stoinis",	"All-Rounder",	"11 Crore");
    hadingg o3 = new hadingg("Ravi Bishnoi"	,"Bowler",	"4 Crore");
    hadingg o4 = new hadingg("Quinton De Kock",	"Wicket-keeper"	,"6.75 crore");
    hadingg o5 = new hadingg("Manish Pandey",	"Batsman"	,"4.6 crore");
    hadingg o6 = new hadingg("Jason Holder",	"All-Rounder"	,"8.75 crore");
    hadingg o7 = new hadingg("Deepak Hooda",	"All-Rounder",	"5.75 crore");
    hadingg o8 = new hadingg("Krunal Pandya",	"All-Rounder",	"8.25 crore");
    hadingg o9 = new hadingg("Avesh Khan"	,"Bowler"	,"10 crore");
    hadingg o10 = new hadingg("Ankit Rajpoot"	,"Bowler"	,"50 lakh");
    hadingg o11 = new hadingg("Mark Wood"	,"Bowler"	,"7.5 crore");
    hadingg o12 = new hadingg("K Gowtham"	,"All-Rounder",	"90 lakh");
    hadingg o13 = new hadingg("Dushmanta Chameera",	"Bowler",	"2 crore");
    hadingg o14 = new hadingg("Shahbaz Nadeem",	"Bowler"	,"50 lakh");
    hadingg o15 = new hadingg("Manan Vohra",	"Batsman",	"20 lakh");
    hadingg o16 = new hadingg("Mohsin Khan",	"Bowler",	"20 lakh");
    hadingg o17 = new hadingg("Ayush Badoni"	,"All-Rounder",	"20 lakh");
    hadingg o18 = new hadingg("Kyle Mayers",	"All-Rounder"	,"50 lakh");
    hadingg o19 = new hadingg("Karan Sharma"	,"All-Rounder"	,"20 lakh");
    hadingg o20 = new hadingg("Evin Lewis"	,"Batsman",	"2 crore");
    hadingg o21 = new hadingg("Mayank Yadav",	"Bowler",	"20 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21};
    RecyclerView recyclerView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        recyclerView3 = findViewById(R.id.recyclerView3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView3.setAdapter(ad);
    }
}