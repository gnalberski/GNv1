package com.example.x.gn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {


    protected void onCreate1(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickexit(View view) {
        finish();
    }


    Button b;
    static MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.menumusic1);
        b = (Button) findViewById(R.id.butmove);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

    }


    public void Listarobotow(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button) findViewById(R.id.button2);
        but1.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent toy = new Intent(MainActivity.this, Listarobotow.class);
                startActivity(toy);
                setContentView(R.layout.activity_listarobotow);
            }
        });
    }

    public void Listarobotow(View view) {
    }
}
