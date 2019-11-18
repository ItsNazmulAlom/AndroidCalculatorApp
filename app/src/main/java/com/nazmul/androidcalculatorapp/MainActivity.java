package com.nazmul.androidcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TextView txt_result;
    EditText first_number,second_number;

    Button btnSum,btnSub,btnMul,btnDiv,btnRute,btnModulus,btnClear,btnSquire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSum = findViewById(R.id.btn_sum);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnRute = findViewById(R.id.btn_rute);
        btnModulus = findViewById(R.id.btn_modulus);
        btnClear = findViewById(R.id.btn_clear);
        btnSquire = findViewById(R.id.btn_squire);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = first_number.getText().toString();
                String value2 = second_number.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    double number1 = Double.parseDouble(value1);
                    double number2 = Double.parseDouble(value2);
                    double result = number1+number2;
                    txt_result.setText(""+result);
                }

            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
