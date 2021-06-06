package com.example.x.gn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Listarobotow extends AppCompatActivity {


    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarobotow);

        Button btn1 = (Button) findViewById(R.id.button77);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Listarobotow.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void Listarobotow2(View view) {


        Button button22 = (Button) findViewById(R.id.button33);
        button22.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent2 = new Intent(Listarobotow.this, RobotsShadow.class);
                startActivity(intent2);
            }
        });
    }

    public void PickRobotJaguar(View view) {

        Button buttonintentSelectedRobotJaguar1 = (Button) findViewById(R.id.PickRobotJaguar);
        buttonintentSelectedRobotJaguar1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentSelectedRobotJaguar1 = new Intent(Listarobotow.this, SelectedRobotJaguar.class);
                startActivity(intentSelectedRobotJaguar1);
            }
        });
    }

}