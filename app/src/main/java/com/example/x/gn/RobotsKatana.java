package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsKatana extends RobotsElectra{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotykatana);

        Button btn61= (Button) findViewById(R.id.KatanaPowrot);
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i21 = new Intent(RobotsKatana.this, RobotsElectra.class);
                startActivity(i21);
            }
        });
    }


    public void Listarobotow61 (View view) {


        Button button441 = (Button) findViewById(R.id.KatanaDalej);
        button441.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent51 = new Intent(RobotsKatana.this, RobotsShredder.class);
                startActivity(intent51);
            }
        });
    }
}
