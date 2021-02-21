package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsCossette extends PilotsIbrahim{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocicossette);

        Button btn8= (Button) findViewById(R.id.CossettePowrot);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i51 = new Intent(PilotsCossette.this, PilotsIbrahim.class);
                startActivity(i51);
            }
        });
    }

    public void Listapilotow6691 (View view) {


        Button button5551 = (Button) findViewById(R.id.CossetteDalej);
        button5551.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent553 = new Intent(PilotsCossette.this, PilotsRaven.class);
                startActivity(intent553);
            }
        });
    }



}
