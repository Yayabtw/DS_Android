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

public class MainActivity extends AppCompatActivity {

    Button bt1;
    TextView textViewError;
    EditText nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.button);
        textViewError = findViewById(R.id.textViewError);

        bt1.setOnClickListener(view -> {
            textViewError.setText("");
            nombre = findViewById(R.id.editText);
                if (nombre.getText().toString().equals("")){
                    textViewError.setText("Veuillez choisir un nombre");
                } else {
                    int number = Integer.parseInt(nombre.getText().toString());
                    if (number < 25 || number > 65){
                        textViewError.setText("Le nombre doit être entre 25 et 65 !");
                    } else {
                        Intent intent = new Intent(MainActivity.this, Game.class);
                        intent.putExtra("Nombre", nombre.getText().toString());
                        startActivity(intent);
                    }
                }

        });

    }
}