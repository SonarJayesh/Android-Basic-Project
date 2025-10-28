package com.jayesh.datetimepickerapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void openDPicker(View v)
        {
            TextView txtDate = findViewById(R.id.txtDate);
            DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    txtDate.setText("Date : "+i2+"/"+(i1+1)+"/"+i);
                }
            },2000,1,1);
            dpd.show();
        }
        public void openTPicker(View v)
        {
            TextView txtTime = findViewById(R.id.txtTime);
            TimePickerDialog tpd = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    txtTime.setText("Time : "+i+":"+i1);
                }
            },12,0,true);
            tpd.show();
        }
    }
