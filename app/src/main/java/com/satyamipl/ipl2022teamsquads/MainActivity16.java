package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity16 extends AppCompatActivity {
    hadingg o1 = new hadingg("Kane Williamson",	"Batsman"	,"14 Crore");
    hadingg o2 = new hadingg("Abdul Samad"	,"Batsman",	"4 Crore");
    hadingg o3 = new hadingg("Umran Malik"	,"Bowler",	"4 Crore");
    hadingg o4 = new hadingg("Washington Sundar"	,"All-Rounder"	,"8.75 crore");
    hadingg o5 = new hadingg("Nicholas Pooran",	"Batsman",	"10.75 crore");
    hadingg o6 = new hadingg("Priyam Garg",	"Batsman",	"20 lakh");
    hadingg o7 = new hadingg("Rahul Tripathi"	,"Batsman",	"8.5 crore");
    hadingg o8 = new hadingg("Abhishek Sharma",	"All-Rounder",	"6.5 crore");
    hadingg o9 = new hadingg("Kartik Tyagi"	,"Bowler",	"4 crore");
    hadingg o10 = new hadingg("Shreyas Gopal"	,"Bowler"	,"75 lakh");
    hadingg o11 = new hadingg("J Suchith",	"Bowler"	,"20 lakh");
    hadingg o12 = new hadingg("T Natarajan"	,"Bowler"	,"4 crore");
    hadingg o13 = new hadingg("Bhuvneshwar" ,"Kumar	Bowler",	"4.2 crore");
    hadingg o14 = new hadingg("Aiden Markram"	,"Batsman"	,"2.6 crore");
    hadingg o15 = new hadingg("Marco Jansen",	"Bowler"	,"4.2 crore");
    hadingg o16 = new hadingg("Romario Shepherd",	"All-Rounder",	"7.75 crore");
    hadingg o17 = new hadingg("Sean Abbott"	,"Bowler",	"2.4 crore");
    hadingg o18 = new hadingg("Ravikumar Samarth"	,"Batsman",	"20 lakh");
    hadingg o19 = new hadingg("Shashank Singh",	"Batsman",	"20 lakh");
    hadingg o20 = new hadingg("Saurabh Dubey",	"Bowler",	"20 lakh");
    hadingg o21 = new hadingg("Vishnu Vinod",	"Wicket-keeper",	"50 lakh");
    hadingg o22 = new hadingg("Glenn Phillips"	,"Wicket-keeper"	,"1.5 crore");
    hadingg o23 = new hadingg("Fazalhaq Farooqi"	,"Bowler",	"50 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23};
    RecyclerView recyclerView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        recyclerView10 = findViewById(R.id.recyclerView10);
        recyclerView10.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView10.setAdapter(ad);
    }
}