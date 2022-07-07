package com.example.tripisss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class AddUsers extends AppCompatActivity {
ArrayList<String> list;
String[] names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_users);
        TextView trip = findViewById(R.id.trip);
        Intent intent = getIntent();
        String city = intent.getStringExtra("tn");
        city = "Trip to "+ city;
        trip.setText(city);
        list = new ArrayList<String>();
        String[] name1 = {"Pawan","array","Bishesh","Mehul","Pawan","array","Bishesh","Mehul","Pawan","array","Bishesh","Mehul"};
        names = name1;
        LinearLayout ly = findViewById(R.id.linear);
        for(int i=0; i< names.length; i++){
            ly.addView(create(names[i],i));
            ly.addView(space());
        }
    }

    public LinearLayout space() {
        LinearLayout lly = new LinearLayout(getApplicationContext());
        lly.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 80));
        return lly;
    }

    public LinearLayout create(String name, int x) {
        LinearLayout lly = new LinearLayout(getApplicationContext());
        lly.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150));
        lly.setOrientation(LinearLayout.HORIZONTAL);
        lly.setBackgroundColor(getResources().getColor(R.color.white));
        TextView txt = new TextView(getApplicationContext());
        txt.setLayoutParams(new LinearLayout.LayoutParams(750,150));
        txt.setTextSize(30);
        name = "   "+name;
        txt.setText(name);
        ImageView iv = new ImageView(getApplicationContext());
        iv.setLayoutParams(new LinearLayout.LayoutParams(120,120));
        iv.setImageResource(R.drawable.icon);
        ImageView iv1 = new ImageView(getApplicationContext());
        iv1.setLayoutParams(new LinearLayout.LayoutParams(140,140));
        iv1.setImageResource(R.drawable.add);
        iv1.setId(100+x);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setImageResource(R.drawable.ok);
                int kl = iv1.getId();
                list.add(names[kl-100]);
                int idx = list.size()-1;
                Toast.makeText(getApplicationContext(),list.get(idx),Toast.LENGTH_LONG).show();
            }
        });
        lly.addView(iv);
        lly.addView(txt);
        lly.addView(iv1);
        return lly;
    }
}