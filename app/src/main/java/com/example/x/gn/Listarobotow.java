package com.example.x.gn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class Listarobotow extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarobotow);

        Button btn1 = (Button) findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Listarobotow.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
