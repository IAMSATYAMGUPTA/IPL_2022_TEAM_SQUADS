package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity12 extends AppCompatActivity {
    hadingg o1 = new hadingg("Andre Russell"	,"All-Rounder",	"12 Crore");
    hadingg o2 = new hadingg("Varun Chakravarthy",	"Bowler",	"8 Crore");
    hadingg o3 = new hadingg("Venkatesh Iyer",	"All-Rounder",	"8 Crore");
    hadingg o4 = new hadingg("Sunil Narine",	"All-Rounder",	"6 Crore");
    hadingg o5 = new hadingg("Pat Cummins"	,"All-Rounder"	,"7.25 crore");
    hadingg o6 = new hadingg("Shreyas Iyer",	"Batsmen",	"12.25 crore");
    hadingg o7 = new hadingg("Nitish Rana",	"Batsmen",	"8 crore");
    hadingg o8 = new hadingg("Shivam Mavi",	"Bowler",	"7.25 crore");
    hadingg o9 = new hadingg("Sheldon Jackson"	,"Batsmen",	"60 lakh");
    hadingg o10 = new hadingg("Ajinkya Rahane"	,"Batsmen",	"1 crore");
    hadingg o11 = new hadingg("Rinku Singh",	"Batsmen"	,"55 lakh");
    hadingg o12 = new hadingg("Anukul Roy",	"All-Rounder",	"20 lakh");
    hadingg o13 = new hadingg("Rasikh Dar",	"Bowler"	,"20 lakh");
    hadingg o14 = new hadingg("Baba Indrajith"	,"Batsmen"	,"20 lakh");
    hadingg o15 = new hadingg("Chamika Karunaratne"	,"Bowler",	"50 lakh");
    hadingg o16 = new hadingg("Abhijeet Tomar"	,"Batsmen",	"40 lakh");
    hadingg o17 = new hadingg("Pratham Singh",	"Batsmen"	,"20 lakh");
    hadingg o18 = new hadingg("Ashok Sharma" ,	"Bowler"	,"55 lakh");
    hadingg o19 = new hadingg("Sam Billings" ,"Wicket-keeper",	"2 crore");
    hadingg o20 = new hadingg("Alex Hales"	,"Batsmen"	,"1.5 crore");
    hadingg o21 = new hadingg("Tim Southee"	,"Bowler",	"1.5 crore");
    hadingg o22 = new hadingg("Ramesh Kumar"	,"Batsmen",	"20 lakh");
    hadingg o23 = new hadingg("Mohammad Nabi",	"All-Rounder",	"1 crore");
    hadingg o24 = new hadingg("Umesh Yadav"	,"Bowler"	,"2 crore");
    hadingg o25 = new hadingg("Aman Khan"	,"Batsmen",	"20 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24,o25};
    RecyclerView recyclerView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        recyclerView6 = findViewById(R.id.recyclerView6);
        recyclerView6.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView6.setAdapter(ad);
    }
}