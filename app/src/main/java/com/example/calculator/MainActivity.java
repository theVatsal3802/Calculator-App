package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText a, b;
    TextView ans;
    Button ad, s, m, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.number1);
        b = findViewById(R.id.number2);

        ans = findViewById(R.id.answer);

        ad = findViewById(R.id.addbutton);
        s = findViewById(R.id.subbutton);
        m = findViewById(R.id.mulbutton);
        d = findViewById(R.id.divbutton);

        ad.setOnClickListener(view -> {
            double num1, num2, result;
            num1 = Double.parseDouble(a.getText().toString());
            num2 = Double.parseDouble(b.getText().toString());
            result = num1 + num2;
            ans.setText(String.valueOf(result));
        });

        s.setOnClickListener(view -> {
            double num1, num2, result;
            num1 = Double.parseDouble(a.getText().toString());
            num2 = Double.parseDouble(b.getText().toString());
            result = num1 - num2;
            ans.setText(String.valueOf(result));
        });

        m.setOnClickListener(view -> {
            double num1, num2, result;
            num1 = Double.parseDouble(a.getText().toString());
            num2 = Double.parseDouble(b.getText().toString());
            result = num1 * num2;
            ans.setText(String.valueOf(result));
        });

        d.setOnClickListener(view -> {
            double num1, num2, result;
            num1 = Double.parseDouble(a.getText().toString());
            num2 = Double.parseDouble(b.getText().toString());
            result = num1 / num2;
            ans.setText(String.valueOf(result));
        });
    }
}