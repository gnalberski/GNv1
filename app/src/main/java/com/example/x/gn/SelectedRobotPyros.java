package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotPyros extends SelectedRobotThorn {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotpyros);
    }



    public void GoToPilotsPyros(View view) {


        Button GoToPilotsButtonPyros = (Button) findViewById(R.id.GoToPilotsSelectionPyros);
        GoToPilotsButtonPyros.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonPyros = new Intent(SelectedRobotPyros.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonPyros);
            }
        });
    }

}