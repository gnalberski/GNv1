package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilotsRaven extends PilotsCossette{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilociraven);

        Button btn896= (Button) findViewById(R.id.RavenPowrot);
        btn896.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i596 = new Intent(PilotsRaven.this, PilotsCossette.class);
                startActivity(i596);
            }
        });
    }



}
