package com.rosid.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // get intent
        Intent i = getIntent();
        //get data
        /*
        String pesan = i.getData().toString();
        */

        //get Extra
        String pesan = i.getStringExtra("TextView");
        //give data to textView
        TextView text = (TextView) findViewById(R.id.TextView);
        text.setText(pesan);

    }
}
