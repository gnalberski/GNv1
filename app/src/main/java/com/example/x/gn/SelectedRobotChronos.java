package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotChronos extends SelectedRobotGargoyle {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotchronos);
    }



    public void GoToPilotsChronos(View view) {


        Button GoToPilotsButtonChronos = (Button) findViewById(R.id.GoToPilotsSelectionChronos);
        GoToPilotsButtonChronos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonChronos = new Intent(SelectedRobotChronos.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonChronos);
            }
        });
    }

}