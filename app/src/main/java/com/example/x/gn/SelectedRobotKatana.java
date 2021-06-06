package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotKatana extends SelectedRobotElectra {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotkatana);
    }



    public void GoToPilotsKatana(View view) {


        Button GoToPilotsButtonKatana = (Button) findViewById(R.id.GoToPilotsSelectionKatana);
        GoToPilotsButtonKatana.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonKatana = new Intent(SelectedRobotKatana.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonKatana);
            }
        });
    }

}