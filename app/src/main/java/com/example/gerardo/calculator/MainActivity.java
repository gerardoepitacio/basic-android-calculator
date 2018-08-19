package com.example.gerardo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txvResult;
    private EditText edtOperand1;
    private EditText edtOperand2;
    private Button btnAdd;
    private Button btnSus;
    private Button btnMult;
    private Button btnDiv;
    private Button btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtOperand1 = (EditText) findViewById(R.id.edtOperand1);
        edtOperand2 = (EditText) findViewById(R.id.edtOperand2);
        btnAdd = (Button) findViewById(R.id.btnAddition);
        btnSus = (Button) findViewById(R.id.btnSustraction);
        btnMult = (Button) findViewById(R.id.btnMultiply);
        btnDiv = (Button) findViewById(R.id.btnDivision);
        btnClear = (Button) findViewById(R.id.btnClear);
        txvResult = (TextView) findViewById(R.id.txvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtOperand1.getText().length() > 0 && edtOperand2.getText().length() > 0){
                    double op1 = Double.parseDouble(edtOperand1.getText().toString());
                    double op2 = Double.parseDouble(edtOperand2.getText().toString());
                    txvResult.setText(""+(op1+op2));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields ", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtOperand1.getText().length() > 0 && edtOperand2.getText().length() > 0){
                    double op1 = Double.parseDouble(edtOperand1.getText().toString());
                    double op2 = Double.parseDouble(edtOperand2.getText().toString());
                    txvResult.setText(""+(op1-op2));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields ", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtOperand1.getText().length() > 0 && edtOperand2.getText().length() > 0){
                    double op1 = Double.parseDouble(edtOperand1.getText().toString());
                    double op2 = Double.parseDouble(edtOperand2.getText().toString());
                    txvResult.setText(""+(op1*op2));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields ", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtOperand1.getText().length() > 0 && edtOperand2.getText().length() > 0){
                    double op1 = Double.parseDouble(edtOperand1.getText().toString());
                    double op2 = Double.parseDouble(edtOperand2.getText().toString());
                    txvResult.setText(""+(op1/op2));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields ", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperand1.setText("");
                edtOperand2.setText("");
                txvResult.setText("0.0");
                edtOperand1.requestFocus();
            }
        });

    }
}
