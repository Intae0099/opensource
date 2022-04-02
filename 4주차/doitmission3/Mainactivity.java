package com.cookandroid.doitmission_03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("도전 안드로이드 미션 2018038033 김태인");

        img1 = (ImageView) findViewById(R.id.imageView1);
        img2 = (ImageView) findViewById(R.id.imageView2);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(img2.getVisibility() == View.VISIBLE) {
                    Drawable temp = img2.getDrawable();
                    img2.setImageDrawable(null);
                    img2.setVisibility(View.INVISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img1.setImageDrawable(temp);
                }else{
                    Log.d("","");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(img1.getVisibility() == View.VISIBLE) {
                    Drawable temp = img1.getDrawable();
                    img1.setImageDrawable(null);
                    img1.setVisibility(View.INVISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img2.setImageDrawable(temp);
                }else{
                    Log.d("","");
                }
            }
        });
    }


}
