package com.example.medbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{

    private ImageView handwash , coverface, avoidcrowd,stayhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        handwash=(ImageView) findViewById(R.id.handwashid);
        coverface=(ImageView) findViewById(R.id.coverfaceid);
        avoidcrowd=(ImageView) findViewById(R.id.avoidcrowdid);
        stayhome=(ImageView) findViewById(R.id.stayhomeid);


        handwash.setOnClickListener(this);
        coverface.setOnClickListener(this);
        avoidcrowd.setOnClickListener(this);
        stayhome.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if (v.getId()== R.id.handwashid)
        {
            handwash.setVisibility(v.GONE);
            coverface.setVisibility(v.VISIBLE);

        }

        else if (v.getId()== R.id.coverfaceid)
        {
            coverface.setVisibility(v.GONE);
            avoidcrowd.setVisibility(v.VISIBLE);

        }

        else if (v.getId()== R.id.avoidcrowdid)
        {
            avoidcrowd.setVisibility(v.GONE);
            stayhome.setVisibility(v.VISIBLE);

        }

        else if (v.getId()== R.id.stayhomeid)
        {
            stayhome.setVisibility(v.GONE);
            openActivity4();

        }



    }

    private void openActivity4() {

        Intent intent= new Intent(this, Activity4.class);
        startActivity(intent);

    }
}
