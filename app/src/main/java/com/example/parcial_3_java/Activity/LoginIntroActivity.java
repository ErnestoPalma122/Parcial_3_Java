package com.example.parcial_3_java.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.parcial_3_java.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LoginIntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_intro);
        BottomNavigation();
    }

    private void BottomNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        Button btn_SingUp = findViewById(R.id.btn_SingUp);
        Button btn_Login = findViewById(R.id.btn_Login);


        btn_SingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginIntroActivity.this, SingUpActivity.class));
            }
        });
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginIntroActivity.this, LoginActivity.class));
            }
        });
    }

}