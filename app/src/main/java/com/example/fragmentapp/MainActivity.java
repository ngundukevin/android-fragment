package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentapp.screens.Screen1;
import com.example.fragmentapp.screens.Screen2;
import com.example.fragmentapp.screens.Screen3;
import com.example.fragmentapp.screens.Screen4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn_to_1);
        Button b2 = findViewById(R.id.btn_to_2);
        Button b3 = findViewById(R.id.btn_to_3);
        Button b4 = findViewById(R.id.btn_to_4);

        action(b1, Screen1.class);
        action(b2, Screen2.class);
        action(b3, Screen3.class);
        action(b4, Screen4.class);


    }


   void loadScreen(Class aClass) {
       Intent intent= new Intent(this,aClass );
       startActivity(intent);
   }

   void action(Button button, final Class aClass) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadScreen(aClass);
            }
        });
   }
}
