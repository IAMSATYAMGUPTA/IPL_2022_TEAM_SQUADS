package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity10 extends AppCompatActivity {
    hadingg o1 = new hadingg("Hardik Pandya"	,"All-Rounder"	,"15 Crore");
    hadingg o2 = new hadingg("Rashid Khan",	"Bowler",	"15 Crore");
    hadingg o3 = new hadingg("Shubman Gill",	"Batsman"	,"7 Crore");
    hadingg o4 = new hadingg("Mohammad Shami"	,"Bowler",	"6.25 crore");
    hadingg o5 = new hadingg("Jason Roy",	"Batsman",	"2 crore");
    hadingg o6 = new hadingg("Abhinav Sadarangani",	"Batsman"	,"2.6 crore");
    hadingg o7 = new hadingg("Rahul Tewatia"	,"All-Rounder",	"9 crore");
    hadingg o8 = new hadingg("Noor Ahmad"	,"Bowler"	,"30 lakh");
    hadingg o9 = new hadingg("R Sai Kishore",	"Bowler",	"3 crore");
    hadingg o10 = new hadingg("Lockie Ferguson"	,"Bowler",	"10 crore");
    hadingg o11 = new hadingg("Dominic Drakes",	"All-Rounder",	"1.1 crore");
    hadingg o12 = new hadingg("Jayant Yadav"	,"All-Rounder"	,"1.7 crore");
    hadingg o13 = new hadingg("Vijay Shankar",	"All-Rounder"	,"1.4 crore");
    hadingg o14 = new hadingg("Darshan Nalkande",	"All-Rounder"	,"20 lakh");
    hadingg o15 = new hadingg("Yash Dayal"	,"Bowler"	,"3.2 crore");
    hadingg o16 = new hadingg("Alzarri Joseph"	,"Bowler"	,"2.4 crore");
    hadingg o17 = new hadingg("Pradeep Sangwan",	"Bowler"	,"20 lakh");
    hadingg o18 = new hadingg("David Miller",	"Batsman",	"3 crore");
    hadingg o19 = new hadingg("Wriddhiman Saha"	,"Wicket-keeper",	"1.9 crore");
    hadingg o20 = new hadingg("Matthew Wade"	,"Wicket-keeper"	,"2.4 crore");
    hadingg o21 = new hadingg("Gurkeerat Singh"	,"All-Rounder",	"50 lakh");
    hadingg o22 = new hadingg("Varun Aaron"	,"Bowler"	,"50 lakh");
    hadingg o23 = new hadingg("B Sai Sudharshan"	,"Batsman"	,"20 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23};
    RecyclerView recyclerView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        recyclerView4 = findViewById(R.id.recyclerView4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView4.setAdapter(ad);
    }
}