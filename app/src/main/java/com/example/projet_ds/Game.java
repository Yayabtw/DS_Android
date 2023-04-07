package com.example.projet_ds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Game extends AppCompatActivity{
    TextView tvChoice, tvRandom, tvCounter;
    Button btSup, btInf, btPrime;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvChoice = findViewById(R.id.textViewChoice);
        tvRandom = findViewById(R.id.textViewRandom);
        tvCounter = findViewById(R.id.textViewCounter);
        btSup = findViewById(R.id.buttonSup);
        btInf = findViewById(R.id.buttonInf);
        btPrime = findViewById(R.id.buttonPrime);

        Intent i = getIntent();
        String text = i.getStringExtra("Nombre");
        tvChoice.setText("Nombre choisi : "+ text);
        tvRandom.setText("Nombre aléatoire : " + randomNumber());
    }

    public String randomNumber(){
        int min = 25;
        int max = 65;

        Random random = new Random();

        int value = random.nextInt(max + min) + min;
        String valueText = Integer.toString(value);
        return valueText;
    }
}
