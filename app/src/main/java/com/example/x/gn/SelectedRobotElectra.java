package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotElectra extends SelectedRobotPyros {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotelectra);
    }



    public void GoToPilotsElectra(View view) {


        Button GoToPilotsButtonElectra = (Button) findViewById(R.id.GoToPilotsSelectionElectra);
        GoToPilotsButtonElectra.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonElectra = new Intent(SelectedRobotElectra.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonElectra);
            }
        });
    }

}