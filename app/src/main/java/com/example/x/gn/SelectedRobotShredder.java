package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotShredder extends SelectedRobotKatana {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotshredder);
    }



    public void GoToPilotsShredder(View view) {


        Button GoToPilotsButtonShredder = (Button) findViewById(R.id.GoToPilotsSelectionShredder);
        GoToPilotsButtonShredder.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonShredder = new Intent(SelectedRobotShredder.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonShredder);
            }
        });
    }


}