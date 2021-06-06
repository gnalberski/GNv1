package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsPyros extends RobotsThorn {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotypyros);

            Button btn5= (Button) findViewById(R.id.PyrosPowrot);
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent iiii = new Intent(RobotsPyros.this, RobotsThorn.class);
                    startActivity(iiii);
                }
            });
        }


        public void Listarobotow606 (View view) {


            Button button444 = (Button) findViewById(R.id.PyrosDalej);
            button444.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent intent4 = new Intent(RobotsPyros.this, RobotsElectra.class);
                    startActivity(intent4);
                }
            });
        }

    public void PickRobotPyros(View view) {


        Button buttonintentSelectedRobotPyros1 = (Button) findViewById(R.id.PickRobotPyros);
        buttonintentSelectedRobotPyros1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectedRobotPyros1 = new Intent(RobotsPyros.this, SelectedRobotPyros.class);
                startActivity(intentSelectedRobotPyros1);
            }
        });
    }



}