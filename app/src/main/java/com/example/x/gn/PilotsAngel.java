package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsAngel extends PilotsIbrahim{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilociangel);

        Button btn890= (Button) findViewById(R.id.AngelPowrot);
        btn890.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i50 = new Intent(PilotsAngel.this, PilotsIbrahim.class);
                startActivity(i50);
            }
        });
    }

    public void Listapilotow6690 (View view) {


        Button button5550 = (Button) findViewById(R.id.AngelDalej);
        button5550.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent550 = new Intent(PilotsAngel.this, PilotsCossette.class);
                startActivity(intent550);
            }
        });
    }

    public void SelectPilotCrystal(View view) {


        Button buttonSelectPilotAngel = (Button) findViewById(R.id.PickPilotAngel);
        buttonSelectPilotAngel.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectPilotAngel = new Intent(PilotsAngel.this, SelectedRobotAndPilot.class);
                startActivity(intentSelectPilotAngel);
            }
        });
    }


}
