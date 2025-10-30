package com.jayesh.spinnerapplication_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

    }
    public void itemLayout(View view){
        startActivity(new Intent(Menu_Activity.this,Item_Activity.class));
        Toast.makeText(this,"Welcome User!!!",Toast.LENGTH_SHORT).show();
    }
    public void spinnerDemo(View view){

    }
}
