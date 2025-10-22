package com.jayesh.calculator_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Division_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.division_layout);


        EditText txtNo1 = findViewById(R.id.txtNo1);
        EditText txtNo2 = findViewById(R.id.txtNo2);
        Button btnDiv = findViewById(R.id.btnDiv);
        TextView txtDiv = findViewById(R.id.divResult);

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtNo1.getText().toString());
                int b = Integer.parseInt(txtNo2.getText().toString());
                int c = a / b;
                txtDiv.setText(String.valueOf(c));
            }
        });
    }
}
