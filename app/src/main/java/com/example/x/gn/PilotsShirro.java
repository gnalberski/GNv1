package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsShirro extends PilotsChristian{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilocishirro);

        Button btn895= (Button) findViewById(R.id.ShirroPowrot);
        btn895.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i595 = new Intent(PilotsShirro.this, PilotsChristian.class);
                startActivity(i595);
            }
        });
    }

    public void Listapilotow6695 (View view) {


        Button button55595 = (Button) findViewById(R.id.ShirroDalej);
        button55595.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent55895 = new Intent(PilotsShirro.this, PilotsJeanpaul.class);
                startActivity(intent55895);
            }
        });
    }

    public void SelectPilotShirro(View view) {


        Button buttonSelectPilotShirro = (Button) findViewById(R.id.PickPilotShirro);
        buttonSelectPilotShirro.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectPilotShirro = new Intent(PilotsShirro.this, SelectedRobotAndPilot.class);
                startActivity(intentSelectPilotShirro);
            }
        });
    }

}
