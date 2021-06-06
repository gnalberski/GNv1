package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsCrystal extends SelectedRobotJaguar {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocicrystal);
    }


    public void Listapilotow6692 (View view) {


        Button button5552 = (Button) findViewById(R.id.CrystalDalej);
        button5552.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent552 = new Intent(PilotsCrystal.this, PilotsSteffan.class);
                startActivity(intent552);
            }
        });
    }

    public void SelectPilotCrystal(View view) {


        Button buttonSelectPilotCrystal = (Button) findViewById(R.id.PickPilotCrystal);
        buttonSelectPilotCrystal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectPilotCrystal = new Intent(PilotsCrystal.this, SelectedPilotCrystal.class);
                startActivity(intentSelectPilotCrystal);
            }
        });
    }



}
