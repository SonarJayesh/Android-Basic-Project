package com.jayesh.claculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAdd,buttonSub,buttonMul,buttonDiv;
    EditText editTextN1,editTextN2;
    TextView textAnswer;
    int num1, num2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getSupportActionBar();

        buttonAdd = findViewById(R.id.btn_Add);
        buttonSub = findViewById(R.id.btn_Sub);
        buttonMul = findViewById(R.id.btn_Mul);
        buttonDiv = findViewById(R.id.btn_Div);
        editTextN1 = findViewById(R.id.txtNoOne);
        editTextN2 = findViewById(R.id.txtNoTwo);
        textAnswer = findViewById(R.id.txt_Ans);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }

    public int getIntFrontNumbers(EditText editText){
        if (editText.getText().toString().equals(" ")){
            Toast.makeText(this, "Enter Number", Toast.LENGTH_SHORT).show();
            return 0;
        }else {
            return Integer.parseInt(editText.getText().toString());
        }
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
      num1 = getIntFrontNumbers(editTextN1);
      num2 = getIntFrontNumbers(editTextN2);

        if (view.getId() == R.id.btn_Add) {
            textAnswer.setText("Answer= " + (num1 + num2));

        } else if (view.getId()==R.id.btn_Sub) {
            textAnswer.setText("Answer= "+(num1-num2));

        }else if (view.getId()==R.id.btn_Mul) {
            textAnswer.setText("Answer= "+(num1*num2));

        }else if (view.getId()==R.id.btn_Div) {
            textAnswer.setText("Answer= "+((float) num1 / (float)num2));

        }else {
            textAnswer.setText("Please Enter the Numbers");
        }


    }

}