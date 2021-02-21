package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsIbrahim extends PilotsJeanpaul{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilociibrahim);

        Button btn897= (Button) findViewById(R.id.IbrahimPowrot);
        btn897.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i597 = new Intent(PilotsIbrahim.this, PilotsJeanpaul.class);
                startActivity(i597);
            }
        });
    }

    public void Listapilotow6697 (View view) {


        Button button55597 = (Button) findViewById(R.id.IbrahimDalej);
        button55597.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent55497 = new Intent(PilotsIbrahim.this, PilotsAngel.class);
                startActivity(intent55497);
            }
        });
    }



}
