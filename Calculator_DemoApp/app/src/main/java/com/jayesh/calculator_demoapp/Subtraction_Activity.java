package com.jayesh.calculator_demoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Subtraction_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subtraction_layout);

        EditText txtNo1 = findViewById(R.id.txtNo1);
        EditText txtNo2 = findViewById(R.id.txtNo2);
        Button btnSub = findViewById(R.id.btnSub);
        TextView txtSub = findViewById(R.id.txtSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtNo1.getText().toString());
                int b = Integer.parseInt(txtNo2.getText().toString());
                int c = a - b;
                txtSub.setText(String.valueOf(c));
            }
        });
    }
}
