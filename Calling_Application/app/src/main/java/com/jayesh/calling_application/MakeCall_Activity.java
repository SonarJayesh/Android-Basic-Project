package com.jayesh.calling_application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MakeCall_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makecall_layout);
    }
    public void makeCall(View view){
        EditText txtMobileNo = findViewById(R.id.txtMobileNo);

        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+txtMobileNo.getText().toString()));
        startActivity(i);

    }
}
