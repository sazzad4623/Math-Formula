package com.example.hp.mathematics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton generalbtn;
    ImageButton algebrabtn;
    ImageButton geometrybtn;
    ImageButton trikonomitybtn;
    ImageButton calculasbtn;
    ImageButton statisticsbtn;
    ImageButton advancedbtn;
    ImageButton othersbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       generalbtn = (ImageButton) findViewById(R.id.general_btn);
        algebrabtn = (ImageButton) findViewById(R.id.algebra_btn);
        geometrybtn = (ImageButton) findViewById(R.id.geometry_btn);
        trikonomitybtn = (ImageButton) findViewById(R.id.trikonomiti_btn);
        calculasbtn = (ImageButton) findViewById(R.id.calculas_btn);
        statisticsbtn = (ImageButton) findViewById(R.id.statistics_btn);
        advancedbtn = (ImageButton) findViewById(R.id.advanced_btn);
        othersbtn = (ImageButton) findViewById(R.id.others_btn);

        generalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,generalActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        algebrabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,algebraActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        geometrybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,geometryActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        trikonomitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,trikonomityActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        calculasbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,calculasActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        statisticsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,statisticsActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        advancedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,advancedActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        othersbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,othersActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });



    }
}
