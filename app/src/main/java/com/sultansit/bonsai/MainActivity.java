package com.sultansit.bonsai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button BT1, BT2, BT3, BT4, BT5, BT6, BT7, BT8, BT9, BT10, BT11, BT12, BT13,
            BT14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BT1 = (Button) findViewById(R.id.button1);
        BT2 = (Button) findViewById(R.id.button2);
        BT3 = (Button) findViewById(R.id.button3);
        BT4 = (Button) findViewById(R.id.button4);
        BT5 = (Button) findViewById(R.id.button5);
        BT6 = (Button) findViewById(R.id.button6);
        BT7 = (Button) findViewById(R.id.button7);
        BT8 = (Button) findViewById(R.id.button8);
        BT9 = (Button) findViewById(R.id.button9);
        BT10 = (Button) findViewById(R.id.button10);
        BT11 = (Button) findViewById(R.id.button11);
        BT12 = (Button) findViewById(R.id.button12);
        BT13 = (Button) findViewById(R.id.button13);
        BT14 = (Button) findViewById(R.id.button14);

        BT1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Introduction.class);
                startActivity(i);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, History.class);
                startActivity(i);
            }
        });
        BT3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Selection.class);
                startActivity(i);
            }
        });
        BT4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Collect.class);
                startActivity(i);
            }
        });
        BT5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Position.class);
                startActivity(i);
            }
        });
        BT6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, PotSelection.class);
                startActivity(i);
            }
        });
        BT7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Soil.class);
                startActivity(i);
            }
        });
        BT8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Tools.class);
                startActivity(i);
            }
        });
        BT9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Techniques.class);
                startActivity(i);
            }
        });
        BT10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Cutting.class);
                startActivity(i);
            }
        });
        BT11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Wiring.class);
                startActivity(i);
            }
        });
        BT12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Care.class);
                startActivity(i);
            }
        });
        BT13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Buying.class);
                startActivity(i);
            }
        });
        BT14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, End.class);
                startActivity(i);
            }
        });
    }
}
