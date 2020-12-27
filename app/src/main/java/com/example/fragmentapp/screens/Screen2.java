package com.example.fragmentapp.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fragmentapp.MainActivity;
import com.example.fragmentapp.R;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen2);


        Button button = findViewById(R.id.s2_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }


    void goBack(){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
