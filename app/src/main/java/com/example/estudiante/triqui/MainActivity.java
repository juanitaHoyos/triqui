package com.example.estudiante.triqui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button[] botones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botones= new Button[9];

        botones[0]= findViewById(R.id.btn_1);
        botones[1]= findViewById(R.id.btn_2);
        botones[2]= findViewById(R.id.btn_3);
        botones[3]= findViewById(R.id.btn_4);
        botones[4]= findViewById(R.id.btn_5);
        botones[5]= findViewById(R.id.btn_6);
        botones[6]= findViewById(R.id.btn_7);
        botones[7]= findViewById(R.id.btn_8);
        botones[8]= findViewById(R.id.btn_9);


    }
}
