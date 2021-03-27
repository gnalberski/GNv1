package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsGargoyle extends RobotsFlail{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotygargoyle);

        Button btn7= (Button) findViewById(R.id.GargoylePowrot);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(RobotsGargoyle.this, RobotsFlail.class);
                startActivity(i4);
            }
        });
    }


    public void Listarobotow11 (View view) {


        Button button46 = (Button) findViewById(R.id.GargoyleDalej);
        button46.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent7 = new Intent(RobotsGargoyle.this, RobotsChronos.class);
                startActivity(intent7);
            }
        });
    }

    public void PickRobotGargoyle(View view) {


        Button buttonPickRobotGargoyle = (Button) findViewById(R.id.PickRobotGargoyle);
        buttonPickRobotGargoyle.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentPickRobotGargoyle = new Intent(RobotsGargoyle.this, PilotsCrystal.class);
                startActivity(intentPickRobotGargoyle);
            }
        });
    }


}
