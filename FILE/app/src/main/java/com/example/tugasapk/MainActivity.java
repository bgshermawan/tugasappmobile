package com.example.tugasapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button_1);
        btn2 = (Button)findViewById(R.id.button_2);
        btn3 = (Button)findViewById(R.id.button_3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(  MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        });

         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(  MainActivity.this, MainActivity3.class);
                 startActivity(intent);

             }
         });

         btn3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(  MainActivity.this, MainActivity4.class);
                 startActivity(intent);

             }
         });

    }
}
