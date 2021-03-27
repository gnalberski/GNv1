package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsChristian extends PilotsMilano{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocichristian);

        Button btn893= (Button) findViewById(R.id.ChristianPowrot);
        btn893.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i593 = new Intent(PilotsChristian.this, PilotsMilano.class);
                startActivity(i593);
            }
        });
    }

    public void Listapilotow6693 (View view) {


        Button button5515 = (Button) findViewById(R.id.ChristianDalej);
        button5515.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent551 = new Intent(PilotsChristian.this, PilotsShirro.class);
                startActivity(intent551);
            }
        });
    }

    public void SelectPilotChristian(View view) {


        Button buttonSelectPilotChristian = (Button) findViewById(R.id.PickPilotChristian);
        buttonSelectPilotChristian.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectPilotChristian = new Intent(PilotsChristian.this, SelectedRobotAndPilot.class);
                startActivity(intentSelectPilotChristian);
            }
        });
    }




}
