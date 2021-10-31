package com.example.keznel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class results extends AppCompatActivity {
    TextView a,b ;
    Button show ;
    DatabaseReference reff ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        a=(TextView)findViewById(R.id.textView7) ;
        b=(TextView) findViewById(R.id.textView5) ;
        show=(Button) findViewById(R.id.button4) ;
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff = FirebaseDatabase.getInstance().getReference().child("Member").child("1");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String address =dataSnapshot.child("address").getValue().toString() ;
                        String phonenum =dataSnapshot.child("phonenum").getValue().toString() ;
                        a.setText(address);
                        b.setText(phonenum);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
}