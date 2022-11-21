package com.parsh.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    public static final int TIMER = 2000;
    RelativeLayout buttonLayout;
    TextView textView;
    LottieAnimationView buttonAnimation;
    EditText name;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAnimation = findViewById(R.id.button_animation);
        textView = findViewById(R.id.TextView);
        buttonLayout = findViewById(R.id.button);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);

        buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Your name is empty",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(number.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Enter the number",Toast.LENGTH_SHORT).show();
                    return;
                }
                buttonAnimation.setVisibility(View.VISIBLE);
                buttonAnimation.playAnimation();
                textView.setVisibility(View.GONE);
                buttonLayout.setVisibility(View.GONE);

                new Handler().postDelayed(this::resetButton,TIMER);
            }

            private void resetButton() {
                buttonAnimation.pauseAnimation();
                buttonAnimation.setVisibility(View.GONE);
                textView.setVisibility(View.VISIBLE);
                Intent intent = new Intent(getApplicationContext(),second_Activity.class);
                startActivity(intent);

            }
        });
    }
}