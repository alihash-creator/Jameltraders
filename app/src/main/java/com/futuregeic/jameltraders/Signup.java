package com.futuregeic.jameltraders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
    Button button;
    TextView textViw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button=findViewById(R.id.signup);
        textViw=findViewById(R.id.ts);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Signup.this,Login.class);
                startActivity(intent);
            }
        });
        textViw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Signup.this,Login.class);
                startActivity(intent);
            }
        });

    }
}