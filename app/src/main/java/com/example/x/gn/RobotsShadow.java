package com.example.x.gn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsShadow extends Listarobotow {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotyshadow);

        Button btn3= (Button) findViewById(R.id.ShadowPowrot);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iii = new Intent(RobotsShadow.this, Listarobotow.class);
                startActivity(iii);
            }
        });
    }


    public void Listarobotow3(View view) {


        Button button333 = (Button) findViewById(R.id.ShadowDalej);
        button333.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent3 = new Intent(RobotsShadow.this, RobotsThorn.class);
                startActivity(intent3);
            }
        });
    }

    public void PickRobotShadow(View view) {


        Button buttonPickRobotShadow = (Button) findViewById(R.id.PickRobotShadow);
        buttonPickRobotShadow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentPickRobotShadow = new Intent(RobotsShadow.this, PilotsCrystal.class);
                startActivity(intentPickRobotShadow);
            }
        });
    }


}