package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity15 extends AppCompatActivity {
    hadingg o1 = new hadingg("Sanju Samson",	"Wicket-keeper",	"14 Crore");
    hadingg o2 = new hadingg("Jos Buttler"	,"Batsman",	"10 Crore");
    hadingg o3 = new hadingg("Yashasvi Jaiswal"	,"Batsman",	"4 Crore");
    hadingg o4 = new hadingg("R. Ashwin"	,"Bowler",	"5 crore");
    hadingg o5 = new hadingg("Trent Boult"	,"Bowler","8 crore");
    hadingg o6 = new hadingg("Shimron Hetmyer",	"Batsman",	"8.5 crore");
    hadingg o7 = new hadingg("Devdutt Padikkal",	"Batsman",	"7.75 crore");
    hadingg o8 = new hadingg("Riyan Parag",	"All-rounders"	,"3.8 crore");
    hadingg o9 = new hadingg("KC Cariappa",	"Bowler"	,"30 lakh");
    hadingg o10 = new hadingg("Prasidh Krishna",	"Bowler",	"10 crore");
    hadingg o11 = new hadingg("Yuzvendra Chahal"	,"Bowler",	"6.5 crore");
    hadingg o12 = new hadingg("Navdeep Saini"	,"Bowler"	,"2.6 crore");
    hadingg o13 = new hadingg("Obed McCoy"	,"Bowler"	,"75 lakh");
    hadingg o14 = new hadingg("Anunay Singh"	,"All-rounders",	"20 lakh");
    hadingg o15 = new hadingg("Kuldeep Sen",	"Bowler"	,"20 lakh");
    hadingg o16 = new hadingg("Karun Nair"	,"Batsman",	"1.4 crore");
    hadingg o17 = new hadingg("Dhruv Jurel",	"Wicket-keeper"	,"20 lakh");
    hadingg o18 = new hadingg("Tejas Baroka"	,"Bowler",	"20 lakh");
    hadingg o19 = new hadingg("Kuldip Yadav"	,"Bowler"	,"20 lakh");
    hadingg o20 = new hadingg("Shubham Garhwal",	"All-rounders",	"20 lakh");
    hadingg o21 = new hadingg("James Neesham"	,"All-rounders"	,"1.5 crore");
    hadingg o22 = new hadingg("Nathan" ,"Coulter-Nile	Bowlers",	"2 crore");
    hadingg o23 = new hadingg("Rassie van der Dussen"	,"Batsman",	"1 crore");
    hadingg o24 = new hadingg("Daryl Mitchell",	"Batsman"	,"75 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24};
    RecyclerView recyclerView9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        recyclerView9 = findViewById(R.id.recyclerView9);
        recyclerView9.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView9.setAdapter(ad);
    }
}