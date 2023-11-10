package com.Dimushok.mobapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void go_to_act_2(View v){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void go_to_act_3(View v){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void go_to_act_4(View v){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void close_app (View view) {
        finishAffinity();
    }
}