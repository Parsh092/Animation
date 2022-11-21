package com.parsh.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import maes.tech.intentanim.CustomIntent;

public class second_Activity extends AppCompatActivity {
RelativeLayout button_1;
RelativeLayout button_2;
RelativeLayout button_3;
RelativeLayout button_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second_Activity.this,Third_Activity.class);
                startActivity(intent);
                CustomIntent.customType(second_Activity.this,"right-to-left");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second_Activity.this,Third_Activity.class);
                startActivity(intent);
                CustomIntent.customType(second_Activity.this,"left-to-right");
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second_Activity.this,Third_Activity.class);
                startActivity(intent);
                CustomIntent.customType(second_Activity.this,"fadein-to-fadeout");
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second_Activity.this,Third_Activity.class);
                startActivity(intent);
                CustomIntent.customType(second_Activity.this,"bottom-to-up");
            }
        });

    }
}