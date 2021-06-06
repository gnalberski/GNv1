package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SelectedRobotGargoyle extends SelectedRobotShredder {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedrobotgargoyle);
    }



    public void GoToPilotsGargoyle(View view) {


        Button GoToPilotsButtonGargoyle = (Button) findViewById(R.id.GoToPilotsSelectionGargoyle);
        GoToPilotsButtonGargoyle.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentGoToPilotsButtonGargoyle = new Intent(SelectedRobotGargoyle.this, PilotsCrystal.class);
                startActivity(intentGoToPilotsButtonGargoyle);
            }
        });
    }

}