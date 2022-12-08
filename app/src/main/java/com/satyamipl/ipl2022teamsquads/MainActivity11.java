package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity11 extends AppCompatActivity {
    hadingg o1 = new hadingg("Ravindra Jadeja"	,"All-Rounder",	"16 Crore");
    hadingg o2 = new hadingg("MS Dhoni"	,"Wicket-keeper",	"12 Crore");
    hadingg o3 = new hadingg("Moeen Ali",	"All-Rounder",	"8 Crore");
    hadingg o4 = new hadingg("Ruturaj Gaikwad",	"Batsman",	"6 Crore");
    hadingg o5 = new hadingg("Dwayne Bravo",	"Bowler",	"4.4 crore");
    hadingg o6 = new hadingg("Ambati Rayudu",	"Wicket-keeper",	"6.75 crore");
    hadingg o7 = new hadingg("KM Asif"	,"Bowler"	,"20 lakh");
    hadingg o8 = new hadingg("Tushar Deshpande",	"Bowler"	,"20 lakh");
    hadingg o9 = new hadingg("Deepak Chahar",	"Bowler"	,"14 crore");
    hadingg o10 = new hadingg("Shivam Dube",	"All-Rounder", "4 crore");
    hadingg o11 = new hadingg("Maheesh Theekshana",	"Bowler",	"70 lakh");
    hadingg o12 = new hadingg("Rajvardhan Hangarkekar"	,"Bowler",	"1.5 crore");
    hadingg o13 = new hadingg("Simarjeet Singh"	,"Bowler"	,"20 lakh");
    hadingg o14 = new hadingg("Devon Conway",	"Batsman"	,"1 crore");
    hadingg o15 = new hadingg("Dwaine Pretorius"	,"All-Rounder"	,"50 lakh");
    hadingg o16 = new hadingg("Mitchell Santner",	"Bowler",	"1.9 crore");
    hadingg o17 = new hadingg("Adam Milne"	,"Bowler"	,"1.9 crore");
    hadingg o18 = new hadingg("Subhranshu Senapati",	"Batsmen",	"20 lakh");
    hadingg o19 = new hadingg("Mukesh Choudhary"	,"Bowler"	,"20 lakh");
    hadingg o20 = new hadingg("Prashant Solanki"	,"Bowler"	,"1.2 crore");
    hadingg o21 = new hadingg("C Hari Nishaanth"	,"Batsman",	"20 lakh");
    hadingg o22 = new hadingg("N Jagadeesan",	"Wicket-keeper",	"20 lakh");
    hadingg o23 = new hadingg("Chris Jordan"	,"Bowler","3.6 crore");
    hadingg o24 = new hadingg("K Bhagath Varma"	,"All-Rounder",	"20 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24};
    RecyclerView recyclerView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        recyclerView5 = findViewById(R.id.recyclerView5);
        recyclerView5.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView5.setAdapter(ad);

    }
}