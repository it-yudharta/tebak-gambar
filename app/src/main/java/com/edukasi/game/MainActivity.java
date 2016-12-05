package com.edukasi.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;       //play
    ImageButton imgO;    //option
    ImageButton imgH;    //help
    ImageButton imgA;    //about
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //>>Button Play
        ib = (ImageButton) findViewById(R.id.imgBtnPlay);

        // membuat listener ketika object di klik

        View.OnClickListener listener = new View.OnClickListener(){
            @Override

            public void onClick(View arg0){
                //TODO...
                Intent i =new Intent(getApplicationContext(),Level.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "Mulai Mainkan Permainan",
                Toast.LENGTH_SHORT).show();
            }

        };
    //<<Button Play

    //>>Button Option
        imgO=(ImageButton)findViewById(R.id.imgBtnOption);
        imgO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO...
                Intent i =new Intent(getApplicationContext(),Level.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "Option",
                Toast.LENGTH_SHORT).show();
            }
        });
    //<<Button Option

    //>>Button Help
        imgH=(ImageButton)findViewById(R.id.imgBtnHelp);
        imgH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //TODO...
                Intent i =new Intent(getApplicationContext(),Level.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "Help",
                Toast.LENGTH_SHORT).show();
            }
        });
    //<<Button Help

    //>>Button About
        imgA=(ImageButton)findViewById(R.id.imgBtnAbout);
        imgA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //TODO...
                Intent i =new Intent(getApplicationContext(),Level.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "About",
                Toast.LENGTH_SHORT).show();
            }
        });
    //<<Button About

    //>>Button Exit
    //<<Button Exit

        //menerapkan listener pada object ib
        ib.setOnClickListener(listener);



    }

}
