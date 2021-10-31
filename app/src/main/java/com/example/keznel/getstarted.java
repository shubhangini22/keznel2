package com.example.keznel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class getstarted extends AppCompatActivity {
    private ImageButton imageButton5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
        imageButton5 = (ImageButton) findViewById((R.id.imageButton5)) ;
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLend() ;
            }
        });
    }
    public void openLend(){
        Intent intent =new Intent(this,Lend.class) ;
        startActivity(intent);

    }
}