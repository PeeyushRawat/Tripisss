package com.example.tripisss;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Transaction {
    public String name;
    public String amt;
    public String time;

    @RequiresApi(api = Build.VERSION_CODES.O)
    Transaction(String x, String y){
        name =x;
        amt = y;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        time = dtf.format(now).toString();
    }

}

