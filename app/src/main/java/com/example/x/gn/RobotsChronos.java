package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsChronos extends RobotsGargoyle{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotychronos);

        Button btn800= (Button) findViewById(R.id.ChronosPowrot);
        btn800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i500 = new Intent(RobotsChronos.this, RobotsGargoyle.class);
                startActivity(i500);
            }
        });
    }

    public void PickRobotChronos(View view) {


        Button buttonintentSelectedRobotChronos1 = (Button) findViewById(R.id.PickRobotChronos);
        buttonintentSelectedRobotChronos1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectedRobotChronos1 = new Intent(RobotsChronos.this, SelectedRobotChronos.class);
                startActivity(intentSelectedRobotChronos1);
            }
        });
    }


}
