package com.jayesh.email_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Email_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_layout);
    }
    public void openEmail(View view){
        startActivity(new Intent(Email_Activity.this, EmailSend_Activity.class));
    }
}
