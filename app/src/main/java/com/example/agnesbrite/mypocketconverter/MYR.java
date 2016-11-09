package com.example.agnesbrite.mypocketconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MYR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myr);

        final EditText myrrates = (EditText) findViewById(R.id.myrrates);
        final EditText rm2 = (EditText) findViewById(R.id.rm2);
        final TextView sgd2 = (TextView) findViewById(R.id.sgd2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double rates = Double.parseDouble(myrrates.getText().toString());
                double rm = Double.parseDouble(rm2.getText().toString());
                double sgd = rm/rates;
                sgd2.setText(Double.valueOf(sgd).toString());
            }
        });
    }
}
