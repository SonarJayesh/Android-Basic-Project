package com.jayesh.calculator_demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu_layout);
        Button btnAdd = findViewById(R.id.btn_Add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_Activity.this,Addition_Activity.class);
                startActivity(i);
            }
            public void openSub(View view){
                Intent i = new Intent(Menu_Activity.this,Subtraction_Activity.class);
                startActivity(i);
            }
        });

    }
}
