package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity13 extends AppCompatActivity {
    hadingg o1 = new hadingg("Rohit Sharma",	"Batsman"	,"16 Crore");
    hadingg o2 = new hadingg("Jasprit Bumrah",	"Bowler",	"12 Crore");
    hadingg o3 = new hadingg("Suryakumar Yadav",	"Batsman",	"8 Crore");
    hadingg o4 = new hadingg("Kieron Pollard",	"All-Rounder","6 Crore");
    hadingg o5 = new hadingg("Ishan Kishan",	"Batsman"	,"15.25 crore");
    hadingg o6 = new hadingg("Dewald Brevis"	,"Batsman",	"3 crore");
    hadingg o7 = new hadingg("Dewald Brevis",	"Batsman"	,"3 crore");
    hadingg o8 = new hadingg("Basil Thampi"	,"Bowler",	"30 lakh");
    hadingg o9 = new hadingg("Murugan Ashwin",	"Bowler"	,"1.6 crore");
    hadingg o10 = new hadingg("Jaydev Unadkat"	,"Bowler",	"1.3 crore");
    hadingg o11 = new hadingg("Mayank Markande"	,"Bowler"	,"65 lakh");
    hadingg o12 = new hadingg("Tilak Varma"	,"Batsman",	"1.7 crore");
    hadingg o13 = new hadingg("Sanjay Yadav",	"All-Rounder"	,"50 lakh");
    hadingg o14 = new hadingg("Jofra Archer",	"Bowler"	,"8 crore");
    hadingg o15 = new hadingg("Daniel Sams",	"All-Rounder"	,"2.6 crore");
    hadingg o16 = new hadingg("Tymal Mills",	"Bowler",	"1.5 crore");
    hadingg o17 = new hadingg("Tim David"	,"All-Rounder"	,"8.25 crore");
    hadingg o18 = new hadingg("Riley Meredith",	"Bowler",	"1 crore");
    hadingg o19 = new hadingg("Mohd Arshad Khan",	"Batsman",	"20 lakh");
    hadingg o20 = new hadingg("Anmolpreet Singh",	"Batsman"	,"20 lakh");
    hadingg o21 = new hadingg("Ramandeep Singh",	"Batsman"	,"20 lakh");
    hadingg o22 = new hadingg("Rahul Buddhi"	,"Batsman",	"20 lakh");
    hadingg o23 = new hadingg("Hrithik Shokeen",	"All-Rounder",	"20 lakh");
    hadingg o24 = new hadingg("Arjun Tendulkar",	"Bowler",	"30 lakh");
    hadingg o25 = new hadingg("Aryan Juyal"	,"Wicket-keeper"	,"20 Lakh");
    hadingg o26 = new hadingg("Fabian Allen",	"All-Rounder"	,"75 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24,o25,o26};
    RecyclerView recyclerView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        recyclerView7 = findViewById(R.id.recyclerView7);
        recyclerView7.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView7.setAdapter(ad);
    }
}