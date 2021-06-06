package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsJeanpaul extends PilotsShirro{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocijeanpaul);

        Button btn8= (Button) findViewById(R.id.JeanpaulPowrot);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(PilotsJeanpaul.this, PilotsShirro.class);
                startActivity(i5);
            }
        });
    }

    public void Listapilotow6698 (View view) {


        Button button555 = (Button) findViewById(R.id.JeanpaulDalej);
        button555.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent555 = new Intent(PilotsJeanpaul.this, PilotsIbrahim.class);
                startActivity(intent555);
            }
        });
    }

    public void SelectPilotJeanpaul(View view) {


        Button buttonSelectPilotJeanpaul = (Button) findViewById(R.id.PickPilotCrystal);
        buttonSelectPilotJeanpaul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectPilotJeanpaul = new Intent(PilotsJeanpaul.this, SelectedRobotJaguar.class);
                startActivity(intentSelectPilotJeanpaul);
            }
        });
    }

}
