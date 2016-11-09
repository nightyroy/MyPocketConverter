package com.example.agnesbrite.mypocketconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        Button yen = (Button) findViewById(R.id.yen);
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Currency.this, JPY.class);
                startActivity(intent);
            }
        });

        Button baht = (Button) findViewById(R.id.baht);
        baht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Currency.this, THB.class);
                startActivity(intent);
            }
        });

        Button rm = (Button) findViewById(R.id.rm);
        rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Currency.this, MYR.class);
                startActivity(intent);
            }
        });

    }
}
