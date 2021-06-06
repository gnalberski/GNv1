package com.example.x.gn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsThorn extends RobotsShadow {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotythorn);

        Button btn4= (Button) findViewById(R.id.ThornPowrot);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iiii = new Intent(RobotsThorn.this, RobotsShadow.class);
                startActivity(iiii);
            }
        });
    }


    public void Listarobotow5 (View view) {


        Button button444 = (Button) findViewById(R.id.ThornDalej);
        button444.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent4 = new Intent(RobotsThorn.this, RobotsPyros.class);
                startActivity(intent4);
            }
        });
    }

    public void PickRobotThorn(View view) {


        Button buttonintentSelectedRobotThorn1 = (Button) findViewById(R.id.PickRobotThorn);
        buttonintentSelectedRobotThorn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectedRobotThorn1 = new Intent(RobotsThorn.this, SelectedRobotThorn.class);
                startActivity(intentSelectedRobotThorn1);
            }
        });
    }


}