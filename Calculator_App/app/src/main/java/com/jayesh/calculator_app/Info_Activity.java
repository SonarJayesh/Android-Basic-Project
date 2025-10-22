package com.jayesh.calculator_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Info_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        TextView txtUsername = findViewById(R.id.txtUsername);
        TextView txtPassword = findViewById(R.id.txtPassword);

        Bundle bundle = getIntent().getExtras();
        txtUsername.setText(Objects.requireNonNull(bundle.get("USERNAME")).toString());
        txtPassword.setText(Objects.requireNonNull(bundle.get("PASSWORD")).toString());
    }
}
