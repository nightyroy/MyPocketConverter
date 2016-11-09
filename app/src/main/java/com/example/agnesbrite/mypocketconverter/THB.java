package com.example.agnesbrite.mypocketconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class THB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thb);

        final EditText thbrates = (EditText) findViewById(R.id.thbrates);
        final EditText baht2 = (EditText) findViewById(R.id.baht2);
        final TextView sgd2 = (TextView) findViewById(R.id.sgd2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double rates = Double.parseDouble(thbrates.getText().toString());
                double baht = Double.parseDouble(baht2.getText().toString());
                double sgd = baht/rates;
                sgd2.setText(Double.valueOf(sgd).toString());
            }
        });
    }
}
