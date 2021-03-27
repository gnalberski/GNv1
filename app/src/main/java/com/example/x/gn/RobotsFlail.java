package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsFlail extends RobotsShredder{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotyflail);

        Button btn7= (Button) findViewById(R.id.FlailPowrot);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(RobotsFlail.this, RobotsShredder.class);
                startActivity(i3);
            }
        });
    }


    public void Listarobotow10 (View view) {


        Button button45 = (Button) findViewById(R.id.FlailDalej);
        button45.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent6 = new Intent(RobotsFlail.this, RobotsGargoyle.class);
                startActivity(intent6);
            }
        });
    }

    public void PickRobotFlail(View view) {


        Button buttonPickRobotFlail = (Button) findViewById(R.id.PickRobotFlail);
        buttonPickRobotFlail.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentPickRobotFlail = new Intent(RobotsFlail.this, PilotsCrystal.class);
                startActivity(intentPickRobotFlail);
            }
        });
    }

}
