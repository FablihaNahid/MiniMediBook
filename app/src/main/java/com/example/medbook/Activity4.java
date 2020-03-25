package com.example.medbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    private Button medi;
    private Button help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        medi=(Button) findViewById(R.id.medicinebuttonid);
        medi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });


        help=(Button) findViewById(R.id.c1);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });


    }

    public void openActivity5()
    {
        Intent intent= new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void openActivity6()
    {
        Intent intent= new Intent(this, Activity6.class);
        startActivity(intent);
    }



}

