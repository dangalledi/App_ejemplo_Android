package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Gracias por su visita", Toast.LENGTH_LONG).show();
    }

    public void irSiguiente(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}