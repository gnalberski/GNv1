package com.example.x.gn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RobotsShredder extends RobotsKatana{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotyshredder);

        Button btn72= (Button) findViewById(R.id.ShredderPowrot);
        btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i31 = new Intent(RobotsShredder.this, RobotsKatana.class);
                startActivity(i31);
            }
        });
    }


    public void Listarobotow72 (View view) {


        Button button452 = (Button) findViewById(R.id.ShredderDalej);
        button452.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent62 = new Intent(RobotsShredder.this, RobotsFlail.class);
                startActivity(intent62);
            }
        });
    }
}
