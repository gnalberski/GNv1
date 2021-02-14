package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsChronos extends RobotsGargoyle{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotychronos);

        Button btn8= (Button) findViewById(R.id.ChronosPowrot);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(RobotsChronos.this, RobotsGargoyle.class);
                startActivity(i5);
            }
        });
    }



}
