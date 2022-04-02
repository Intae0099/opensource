package com.cookandroid.proj4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch SwitchAgree;
    RadioGroup rGroup1;
    RadioButton rdo10, rdo11, rdo12;
    ImageView imgIcon;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기 2018038033 김태인");

        text1 = (TextView) findViewById(R.id.Text1);
        SwitchAgree = (Switch) findViewById(R.id.switchAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdo10 = (RadioButton) findViewById(R.id.Rdo10);
        rdo11 = (RadioButton) findViewById(R.id.Rdo11);
        rdo12 = (RadioButton) findViewById(R.id.Rdo12);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        imgIcon = (ImageView) findViewById(R.id.ImgIcon);

        SwitchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgIcon.setVisibility(View.VISIBLE);
                } else
                {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgIcon.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.Rdo10) {
                    imgIcon.setImageResource(R.drawable.android10);
                } else if (i == R.id.Rdo11) {
                    imgIcon.setImageResource(R.drawable.android11);
                } else if (i == R.id.Rdo12) {
                    imgIcon.setImageResource(R.drawable.android12);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SwitchAgree.setChecked(false);
                rdo10.setChecked(false);
                rdo11.setChecked(false);
                rdo12.setChecked(false);
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                imgIcon.setImageResource(R.drawable.android10);
                imgIcon.setVisibility(View.INVISIBLE);
            }
        });
    }
}
