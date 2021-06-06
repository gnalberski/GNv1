package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsSteffan extends PilotsCrystal{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocisteffan);

        Button btn894= (Button) findViewById(R.id.SteffanPowrot);
        btn894.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i594 = new Intent(PilotsSteffan.this, PilotsCrystal.class);
                startActivity(i594);
            }
        });
    }

    public void Listapilotow6694 (View view) {


        Button button55594 = (Button) findViewById(R.id.SteffanDalej);
        button55594.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent55994 = new Intent(PilotsSteffan.this, PilotsMilano.class);
                startActivity(intent55994);
            }
        });
    }

    public void SelectPilotSteffan(View view) {


        Button buttonSelectPilotSteffan = (Button) findViewById(R.id.PickPilotSteffan);
        buttonSelectPilotSteffan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectPilotSteffan = new Intent(PilotsSteffan.this, SelectedRobotJaguar.class);
                startActivity(intentSelectPilotSteffan);
            }
        });
    }

}
