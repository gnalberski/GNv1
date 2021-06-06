package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotThorn extends SelectedRobotShadow {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotthorn);
    }



    public void GoToPilotsThorn(View view) {


        Button GoToPilotsButtonThorn = (Button) findViewById(R.id.GoToPilotsSelectionThorn);
        GoToPilotsButtonThorn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonThorn = new Intent(SelectedRobotThorn.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonThorn);
            }
        });
    }

}