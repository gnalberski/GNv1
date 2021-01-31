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

public class MainActivity extends AppCompatActivity {


    protected void onCreate1(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickexit(View view) {
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onStart() {

        Button one = (Button) this.findViewById(R.id.butmove);
        super.onStart();
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.menumusic1);
        one.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mp1.isPlaying()) {
                    mp1.pause();
                } else {
                    mp1.start();
                }
            }
        });
    }








    public void Listarobotow1(View view) {


        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Listarobotow.class);
                startActivity(intent);
            }
        });
    }
}

