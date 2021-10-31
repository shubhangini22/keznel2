package com.example.keznel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class inputdetails extends AppCompatActivity {
    TextView itemdetails,phonenumber ;
    Button savebutton ;
    DatabaseReference reff;
    Member member ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputdetails);

        itemdetails =(TextView) findViewById(R.id.textView6) ;
        phonenumber = findViewById(R.id.textView4) ;
        savebutton =(Button) findViewById((R.id.button2)) ;
        member =new Member() ;
        reff = FirebaseDatabase.getInstance().getReference().child("Member") ;
        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity() ;
                Long phn=Long.parseLong(phonenumber.getText().toString().trim()) ;

                member.setItem(itemdetails.getText().toString().trim());
                member.setPh(phn);
                reff.child("member1").setValue(member) ;
                Toast.makeText(inputdetails.this,"Data stored successfully",Toast.LENGTH_SHORT).show();


            }
        });

    }
    public void openMainActivity(){
        Intent intent = new Intent(this ,MainActivity.class) ;
        startActivity(intent);
    }
}