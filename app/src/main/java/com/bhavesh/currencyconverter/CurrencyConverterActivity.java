package com.bhavesh.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CurrencyConverterActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        button = findViewById(R.id.button2);
        editText = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()){
                    editText.setText("Please enter the amount");
                }
                else {
                    String s = editText.getText().toString();
                    double i = Double.parseDouble(s);
                    double rupees = i * 73.66;

                    textView.setText(Double.toString((double) rupees) + " Rs ");
                }
            }
        });

    }
}