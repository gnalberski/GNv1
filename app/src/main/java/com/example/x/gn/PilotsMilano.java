package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsMilano extends PilotsSteffan{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocimilano);

        Button btn8= (Button) findViewById(R.id.MilanoPowrot);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(PilotsMilano.this, PilotsSteffan.class);
                startActivity(i5);
            }
        });
    }

    public void Listarobotow6699 (View view) {


        Button button555 = (Button) findViewById(R.id.MilanoDalej);
        button555.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent556 = new Intent(PilotsMilano.this, PilotsChristian.class);
                startActivity(intent556);
            }
        });
    }

    public void SelectPilotMilano(View view) {


        Button buttonSelectPilotMilano = (Button) findViewById(R.id.PickPilotMilano);
        buttonSelectPilotMilano.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectPilotMilano = new Intent(PilotsMilano.this, SelectedRobotAndPilot.class);
                startActivity(intentSelectPilotMilano);
            }
        });
    }

}
