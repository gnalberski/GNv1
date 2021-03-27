package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsElectra extends RobotsPyros{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotyelectra);

        Button btn6= (Button) findViewById(R.id.ElectraPowrot);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i6 = new Intent(RobotsElectra.this, RobotsPyros.class);
                startActivity(i6);
            }
        });
    }


    public void Listarobotow66 (View view) {


        Button button555 = (Button) findViewById(R.id.ElectraDalej);
        button555.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent55 = new Intent(RobotsElectra.this, RobotsKatana.class);
                startActivity(intent55);
            }
        });
    }

    public void PickRobotElectra(View view) {


        Button buttonPickRobotElectra = (Button) findViewById(R.id.PickRobotElectra);
        buttonPickRobotElectra.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentPickRobotElectra = new Intent(RobotsElectra.this, PilotsCrystal.class);
                startActivity(intentPickRobotElectra);
            }
        });
    }



}
