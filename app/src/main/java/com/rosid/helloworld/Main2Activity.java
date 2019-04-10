package com.rosid.helloworld;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public int angka = 0;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void hitung(View view) {
        angka++;
        TextView textCounter = (TextView) findViewById(R.id.textCounter);
        textCounter.setText(Integer.toString(angka));
        Vibrator Vibe = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        if (angka == 33) {
            Vibe.vibrate(2000);
        }
        if (angka ==34){
            reset (v);
        }

    }

    public void reset(View view) {
        angka = 0;
        TextView textCounter = (TextView) findViewById(R.id.textCounter);
        textCounter.setText(Integer.toString(angka));

        String pesan = "Berhasil direset";
        Toast notif = Toast.makeText( this, pesan, 10);
        notif.setGravity(Gravity.FILL_HORIZONTAL,0,-500);
        notif.show();

    }

    public void kurang(View view) {
        angka--;
        TextView textCounter = (TextView) findViewById(R.id.textCounter);
        textCounter.setText(Integer.toString(angka));

    }

}
