package com.kat.wargametimer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class Timer extends AppCompatActivity {
    int timeInMins;

//    public Timer(int timeInMins){
//        this.timeInMins = timeInMins;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    protected void onStart()
    {
        super.onStart();

        //get the text box from the screen
        TextView label = (TextView) findViewById(R.id.Label);

        //get the time from the intent
        Intent intent = getIntent();
        timeInMins = Integer.valueOf( (String) (intent.getExtras().get(MainActivity.TIME_IN_MINS)) );
        
        //set the text
        label.setText("Start point: " + timeInMins);
    }


}
