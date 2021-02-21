package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsCrystal extends RobotsChronos{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocicrystal);

        Button btn8= (Button) findViewById(R.id.CrystalPowrot);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i52 = new Intent(PilotsCrystal.this, RobotsChronos.class);
                startActivity(i52);
            }
        });
    }

    public void Listapilotow6692 (View view) {


        Button button5552 = (Button) findViewById(R.id.CrystalDalej);
        button5552.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent552 = new Intent(PilotsCrystal.this, PilotsSteffan.class);
                startActivity(intent552);
            }
        });
    }



}
