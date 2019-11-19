package com.nazmul.androidcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TextView txtResult;
    EditText firstNumber,secondNumber;

    Button btnSum,btnSub,btnMul,btnDiv,btnRute,btnModulus,btnClear,btnSquire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txt_result);
        firstNumber = findViewById(R.id.first_number);
        secondNumber = findViewById(R.id.second_number);

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
                String value1 = firstNumber.getText().toString();
                String value2 = secondNumber.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    double number1 = Double.parseDouble(value1);
                    double number2 = Double.parseDouble(value2);
                    double result = number1+number2;
                    txtResult.setText(""+result);
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = firstNumber.getText().toString();
                String value2 = secondNumber.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    double number1 = Double.parseDouble(value1);
                    double number2 = Double.parseDouble(value2);
                    double result = number1-number2;
                    txtResult.setText(""+result);
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = firstNumber.getText().toString();
                String value2 = secondNumber.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    double number1 = Double.parseDouble(value1);
                    double number2 = Double.parseDouble(value2);
                    double result = number1*number2;
                    txtResult.setText(""+result);
                }

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = firstNumber.getText().toString();
                String value2 = secondNumber.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    double number1 = Double.parseDouble(value1);
                    double number2 = Double.parseDouble(value2);
                    double result = number1/number2;
                    txtResult.setText(""+result);
                }

            }
        });

        btnSquire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = firstNumber.getText().toString();
                String value2 = secondNumber.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    double number1 = Double.parseDouble(value1);
                    double number2 = Double.parseDouble(value2);
                    double result =   Math.pow(number1,number2);
                    txtResult.setText(""+result);
                }

            }
        });
        btnRute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = firstNumber.getText().toString();
                String value2 = secondNumber.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    double number1 = Double.parseDouble(value1);
                    double result =   Math.sqrt(Double.valueOf(number1));
                    txtResult.setText(""+result);
                }

            }
        });

        btnModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = firstNumber.getText().toString();
                String value2 = secondNumber.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Insert value",Toast.LENGTH_LONG);
                }
                else {
                    int number1 = Integer.parseInt(value1);
                    int number2 = Integer.parseInt(value2);
                    int result = number1%number2;
                    txtResult.setText(""+result);
                }

            }
        });

       btnClear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               txtResult.setText("0");
               firstNumber.setText("");
               secondNumber.setText("");

           }
       });


    }
}
