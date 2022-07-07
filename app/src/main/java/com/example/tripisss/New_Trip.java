package com.example.tripisss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class New_Trip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trip);
        Button b1 = findViewById(R.id.addNewTrip);
        EditText ed = findViewById(R.id.tripName);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String city = ed.getText().toString();
                if(city.length()>0){
                Intent x = new Intent(getApplicationContext(),AddUsers.class);
                x.putExtra("tn",city); //sending data to next page
                startActivity(x);
            }
            }
        });
    }
}