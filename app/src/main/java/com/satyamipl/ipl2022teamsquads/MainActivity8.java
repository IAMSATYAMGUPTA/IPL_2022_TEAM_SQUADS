package com.satyamipl.ipl2022teamsquads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity8 extends AppCompatActivity {
    hadingg o1 = new hadingg("Virat Kohli"	,"Batsman",	"15 Crore");
    hadingg o2 = new hadingg("Glenn Maxwell",	"All-Rounder",	"11 Crore");
    hadingg o3 = new hadingg("Mohammad Siraj"	,"Bowler"	,"7 Crore");
    hadingg o4 = new hadingg("Faf Du Plessis"	,"Batsman"	,"7 crore");
    hadingg o5 = new hadingg("Harshal Patel"	,"Bowler",	"10.75 crore");
    hadingg o6 = new hadingg("Wanindu Hasaranga"	,"Bowler",	"10.75 crore");
    hadingg o7 = new hadingg("Dinesh Karthik" ,"Wicket-keeper",	"5.5 crore");
    hadingg o8 = new hadingg("Shahbaz Ahemad",	"All-Rounder"	,"2.4 crore");
    hadingg o9 = new hadingg("Anuj Rawat",	"Wicket-keeper",	"3.4 crore");
    hadingg o10 = new hadingg("Akash Deep"	,"Bowler"	,"20 lakh");
    hadingg o11 = new hadingg("Josh Hazlewood",	"Bowler"	,"7.75 crore");
    hadingg o12 = new hadingg("Mahipal Lomror",	"All-Rounder"	,"95 lakh");
    hadingg o13 = new hadingg("Finn Allen",	"Wicket-keeper",	"80 lakh");
    hadingg o14 = new hadingg("Sherfane Rutherford",	"All-Rounder",	"1 crore");
    hadingg o15 = new hadingg("Jason Behrendorff"	,"Bowler",	"75 lakh");
    hadingg o16 = new hadingg("Suyash Prabhudessai",	"Batsman"	,"30 lakh");
    hadingg o17 = new hadingg("Chama Milind"	,"Bowler"	,"25 lakh");
    hadingg o18 = new hadingg("Aneeshwar Gautam"	,"All-Rounder",	"20 lakh");
    hadingg o19 = new hadingg("Karn Sharma"	,"Batsman",	"50 lakh");
    hadingg o20 = new hadingg("Siddharth Kaul",	"Batsman"	,"75 lakh");
    hadingg o21 = new hadingg("Luvnith Sisodia" ,"Wicket-keeper"	,"20 lakh");
    hadingg o22 = new hadingg("David Willey",	"Bowler"	,"2 crore");

    hadingg contacts[] = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20,o21,o22};
    RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        mylistadapter ad = new mylistadapter(contacts);
        recyclerView2.setAdapter(ad);
    }
}