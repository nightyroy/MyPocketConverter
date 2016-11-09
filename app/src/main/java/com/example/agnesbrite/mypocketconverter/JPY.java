package com.example.agnesbrite.mypocketconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JPY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpy);

        final EditText jpyrates = (EditText) findViewById(R.id.jpyrates);
        final EditText yen2 = (EditText) findViewById(R.id.yen2);
        final TextView sgd2 = (TextView) findViewById(R.id.sgd2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double rates = Double.parseDouble(jpyrates.getText().toString());
                double yen = Double.parseDouble(yen2.getText().toString());
                double sgd = yen/rates;
                sgd2.setText(Double.valueOf(sgd).toString());
            }
        });
    }
}
