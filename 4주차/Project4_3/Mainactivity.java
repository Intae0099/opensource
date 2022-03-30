package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);
        btnAdd = (Button) findViewById(R.id.button1);
        btnSub = (Button) findViewById(R.id.button2);
        btnMul = (Button) findViewById(R.id.button3);
        btnDiv = (Button) findViewById(R.id.button4);
        btnRem = (Button) findViewById(R.id.button5);
        textResult = (TextView) findViewById(R.id.textView);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.length() == 0 || edit2.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),
                            "오류. 숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.length() == 0 || edit2.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),
                            "오류. 숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.length() == 0 || edit2.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),
                            "오류. 숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.length() == 0 || edit2.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),
                            "오류. 숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(Float.parseFloat(num2) == 0.0)
                    {
                        Toast.makeText(getApplicationContext(),
                                "0은 나눌 수 없습니다.",
                                Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.length() == 0 || edit2.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),
                            "오류. 숫자를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(Float.parseFloat(num2) == 0.0)
                    {
                        Toast.makeText(getApplicationContext(),
                                "0은 나눌 수 없습니다.",
                                Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        result = Float.parseFloat(num1) % Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            }
        });

    }
}
