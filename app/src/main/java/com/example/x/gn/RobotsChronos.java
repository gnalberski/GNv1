package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsChronos extends RobotsGargoyle{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotychronos);

        Button btn800= (Button) findViewById(R.id.ChronosPowrot);
        btn800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i500 = new Intent(RobotsChronos.this, RobotsGargoyle.class);
                startActivity(i500);
            }
        });
    }

    public void PickRobotChronos(View view) {


        Button buttonPickRobotChronos = (Button) findViewById(R.id.PickRobotChronos);
        buttonPickRobotChronos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentPickRobotChronos = new Intent(RobotsChronos.this, PilotsCrystal.class);
                startActivity(intentPickRobotChronos);
            }
        });
    }


}
