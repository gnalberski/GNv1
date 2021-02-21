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

    public void Listarobotow669 (View view) {


        Button button55500 = (Button) findViewById(R.id.ChronosDalej);
        button55500.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent5500 = new Intent(RobotsChronos.this, PilotsCrystal.class);
                startActivity(intent5500);
            }
        });
    }



}
