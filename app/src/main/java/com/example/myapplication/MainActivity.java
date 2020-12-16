package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout myConstraintLayout;
    Button gB, rB, wB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myConstraintLayout = findViewById(R.id.main_container);
        wB = findViewById(R.id.button3);
        gB = findViewById(R.id.button2);
        rB = findViewById(R.id.button);
        gB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myConstraintLayout.setBackgroundColor(getColor(R.color.ColorGreen));
                rB.setBackgroundColor(getColor(R.color.ColorRed));
                gB.setBackgroundColor(getColor(R.color.colorAccent));
                wB.setBackgroundColor(getColor(R.color.ColorWhite));
                Toast.makeText(getApplicationContext(), "Зеленый:)", Toast.LENGTH_SHORT).show();
            }
        });
        rB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myConstraintLayout.setBackgroundColor(getColor(R.color.ColorRed));
                gB.setBackgroundColor(getColor(R.color.ColorGreen));
                rB.setBackgroundColor(getColor(R.color.colorAccent));
                wB.setBackgroundColor(getColor(R.color.ColorWhite));
                Toast.makeText(getApplicationContext(), "Красный:)", Toast.LENGTH_SHORT).show();
            }
        });
        wB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myConstraintLayout.setBackgroundColor(getColor(R.color.ColorWhite));
                gB.setBackgroundColor(getColor(R.color.colorAccent));
                rB.setBackgroundColor(getColor(R.color.colorAccent));
                wB.setBackgroundColor(getColor(R.color.colorAccent));
                Toast.makeText(getApplicationContext(), "Изначальное состояние", Toast.LENGTH_SHORT).show();
            }
        });
    }
}