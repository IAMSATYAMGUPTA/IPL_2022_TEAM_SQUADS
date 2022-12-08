package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity7 extends AppCompatActivity {
    hadingg o1 = new hadingg("Rishabh Pant","Wicket-keeper","16 Crore");
    hadingg o2 = new hadingg("Axar Patel"	,"All-Rounder",	"9 Crore");
    hadingg o3 = new hadingg("Prithvi Shaw","Batsman","7.5 Crore");
    hadingg o4 = new hadingg("Anrich Nortje"	,"Bowler",	"6.5 Crore");
    hadingg o5 = new hadingg("David Warner"	,"Batsman",	"6.25 crore");
    hadingg o6 = new hadingg("Mitchell Marsh"	,"All-Rounder",	"6.5 crore");
    hadingg o7 = new hadingg("Ashwin Hebbar"	,"Batsman",	"20 lakh");
    hadingg o8 = new hadingg("Sarfaraz Khan"	,"Batsman",	"20 lakh");
    hadingg o9 = new hadingg("Kamlesh Nagarkoti",	"Bowler",	"1.1 crore");
    hadingg o10 = new hadingg("KS Bharat",	"Wicket-keeper"	,"2 crore");
    hadingg o11 = new hadingg("Shardul Thakur",	"Bowler",	"10.75 crore");
    hadingg o12 = new hadingg("Mustafizur Rahman"	,"Bowler",	"2 cror");
    hadingg o13 = new hadingg("Kuldeep Yadav",	"Bowler",	"2 crore");
    hadingg o14 = new hadingg("Mandeep Singh",	"Batsman"	,"1.1 crore");
    hadingg o15 = new hadingg("Khaleel Ahmed"	,"Bowler",	"5.25 crore");
    hadingg o16 = new hadingg("Chetan Sakariya"	,"Bowler"	,"4.2 crore");
    hadingg o17 = new hadingg("Lalit Yadav",	"All-Rounder",	"65 lakh");
    hadingg o18 = new hadingg("Ripal Patel"	,"All-Rounder",	"20 lakh");
    hadingg o19 = new hadingg("Yash Dhull"	,"Batsman",	"50 lakh");
    hadingg o20 = new hadingg("Rovman Powell",	"Batsman",	"2.8 crore");
    hadingg o21 = new hadingg("Pravin Dubey"	,"Bowler"	,"50 lakh");
    hadingg o22 = new hadingg("Lungi Ngidi",	"Bowler"	,"50 lakh");
    hadingg o23 = new hadingg("Tim Seifert"	,"Batsman",	"50 lakh");
    hadingg o24 = new hadingg("Vicky Ostwal"	,"All-Rounde",	"20 lakh");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22,o23,o24};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView.setAdapter(ad);
    }
}