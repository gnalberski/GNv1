package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotShadow extends SelectedRobotJaguar {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotshadow);
    }

    public void GoToPilotsShadow(View view) {

        Button GoToPilotsButtonShadow = (Button) findViewById(R.id.GoToPilotsSelectionShadow);
        GoToPilotsButtonShadow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonShadow = new Intent(SelectedRobotShadow.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonShadow);
            }
        });
    }

}