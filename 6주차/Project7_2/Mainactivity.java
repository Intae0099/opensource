package com.cookandroid.project7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button Button1, Button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("2018038033 김태인 배경색 바꾸기(컨택스트 메뉴)");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        Button1 = (Button) findViewById(R.id.button1);
        registerForContextMenu(Button1);
        Button2 = (Button) findViewById(R.id.button2);
        registerForContextMenu(Button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if (v == Button1){
            menu.setHeaderTitle("배경색 변경");

            mInflater.inflate(R.menu.menu1,menu);
        }
        if (v == Button2){
            mInflater.inflate(R.menu.menu2,menu);
        }
    }

}
