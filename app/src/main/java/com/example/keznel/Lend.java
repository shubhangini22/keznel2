package com.example.keznel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Lend extends AppCompatActivity {
    CheckBox cbBooks, cbHardware, cbGuitars, cbCycle;
    Button btSUBMIT;
    TextView tvOutput;
    Button button7 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lend);
        cbBooks = findViewById(R.id.cb_Books);
        cbHardware = findViewById(R.id.cb_Hardware);
        cbGuitars = findViewById(R.id.cb_Guitars);
        cbCycle = findViewById(R.id.cb_Cycle);
        btSUBMIT = findViewById(R.id.bt_SUBMIT);
        tvOutput = findViewById(R.id.output);
        button7 = (Button) findViewById(R.id.button3);

        cbBooks.setOnClickListener(v -> {
            if (cbBooks.isChecked()) {
                cbBooks.setTextColor(getResources().getColor(R.color.white));
            } else {
                cbBooks.setTextColor(getResources().getColor(R.color.black));
            }
        });
        cbCycle.setOnClickListener(v -> {
            if (cbCycle.isChecked()) {
                cbCycle.setTextColor(getResources().getColor(R.color.white));
            } else {
                cbCycle.setTextColor(getResources().getColor(R.color.black));
            }
        });
        cbHardware.setOnClickListener(v -> {
            if (cbHardware.isChecked()) {
                cbHardware.setTextColor(getResources().getColor(R.color.white));
            } else {
                cbHardware.setTextColor(getResources().getColor(R.color.black));
            }
        });
        cbGuitars.setOnClickListener(v -> {
            if (cbGuitars.isChecked()) {
                cbGuitars.setTextColor(getResources().getColor(R.color.white));
            } else {
                cbGuitars.setTextColor(getResources().getColor(R.color.black));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openInputDetails();
            }
        });


    }

    public void openInputDetails() {
        Intent intent = new Intent(this,  inputdetails.class);
        startActivity(intent);

    }
}