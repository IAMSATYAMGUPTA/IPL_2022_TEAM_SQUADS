package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity14 extends AppCompatActivity {
    hadingg o1 = new hadingg("Mayank Agarwal",	"Batsman"	,"12 Crore");
    hadingg o2 = new hadingg("Arshdeep Singh"	,"Bowler"	,"4 Crore");
    hadingg o3 = new hadingg("Shikhar Dhawan"	,"Batsman",	"8.25 crore");
    hadingg o4 = new hadingg("Kagiso Rabada"	,"Bowler",	"9.25 crore");
    hadingg o5 = new hadingg("Jonny Bairstow"	,"Wicket-keeper",	"6.75 crore");
    hadingg o6 = new hadingg("Shahrukh Khan",	"All-Rounder",	"9 crore");
    hadingg o7 = new hadingg("Harpreet Brar"	,"Batsman", "3.8 crore");
    hadingg o8 = new hadingg("Prabhsimran Singh",	"Wicket-keeper",	"60 lakh");
    hadingg o9 = new hadingg("Jitesh Sharma",	"Wicket-keeper",	"20 lakh");
    hadingg o10 = new hadingg("Ishan Porel"	,"Bowler",	"25 lakh");
    hadingg o11 = new hadingg("Rahul Chahar"	,"Bowler",	"5.25 crore");
    hadingg o12 = new hadingg("Liam Livingstone"	,"All-Rounder",	"11.5 crore");
    hadingg o13 = new hadingg("Odean Smith"	,"Batsman",	"6 crore");
    hadingg o14 = new hadingg("Sandeep Sharma"	,"Bowler"	,"50 lakh");
    hadingg o15 = new hadingg("Raj Bawa"	,"Batsman",	"2 crore");
    hadingg o16 = new hadingg("Rishi Dhawan"	,"All-Rounder",	"55 lakh");
    hadingg o17 = new hadingg("Prerak Mankad",	"Batsman"	,"20 lakh");
    hadingg o18 = new hadingg("Vaibhav Arora"	,"Bowler"	,"2 crore");
    hadingg o19 = new hadingg("Writtick Chatterjee",	"Batsman",	"20 lakh");
    hadingg o20 = new hadingg("Baltej Dhanda",	"All-Rounder"	,"20 lakh");
    hadingg o21 = new hadingg("Ansh Patel"	,"All-Rounder"	,"20 lakh");
    hadingg o22 = new hadingg("Nathan Ellis",	"Bowler",	"75 lakh");
    hadingg o23 = new hadingg("Atharva Taide",	"All-Rounder",	"20 lakh");
    hadingg o24 = new hadingg("Bhanuka Rajapaksa"	,"Batsman",	"50 lakh");
    hadingg o25 = new hadingg("Benny Howell",	"All-Rounder"	,"40 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24,o25};
    RecyclerView recyclerView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        recyclerView8 = findViewById(R.id.recyclerView8);
        recyclerView8.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView8.setAdapter(ad);
    }
}