package com.rosid.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view){
        TextView helloText = (TextView) findViewById(R.id.helloText);
        helloText.setText("Welcome ! ");
    }

    public void getToCounter(View v){
        Intent counter = new Intent(this, Main2Activity.class);
        startActivity(counter);

    }
    public void sendData(View v) {
        //get data from editText
        EditText edit = (EditText) findViewById(R.id.editPesan);
        String pesan = edit.getText().toString();

        //create objeck intent
        Intent intent = new Intent (this, Main3Activity.class);

        //put data
        intent.setData(Uri.parse(pesan));
        //start activity
        startActivity(intent);
    }
    public void sendExtras(View view){
        //get data from editText
        EditText edit = (EditText) findViewById(R.id.editPesan);
        String pesan = edit.getText().toString();

        //create objeck intent
        Intent intent = new Intent (this, Main3Activity.class);
        //put extra
        Intent.putExtra("TextView",pesan);//putExtra(key,value);
        //start activity
        startActivity(intent);
    }
}
