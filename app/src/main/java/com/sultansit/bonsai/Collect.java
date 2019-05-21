package com.sultansit.bonsai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Collect extends AppCompatActivity {
    Button BT1, BT2, BT3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);

        BT1 = (Button) findViewById(R.id.button1);
        BT2 = (Button) findViewById(R.id.button3);
        BT3 = (Button) findViewById(R.id.button2);

        BT1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Collect.this, Selection.class);
                startActivity(i);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Collect.this, MainActivity.class);
                startActivity(i);
            }
        });
        BT3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Collect.this, Position.class);
                startActivity(i);
            }
        });
    }
}
