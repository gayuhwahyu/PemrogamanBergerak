package com.gayuhwahyu.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnRegister = findViewById(R.id.btn_Register);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
            case R.id.btn_Register:
                Intent moveRegister = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(moveRegister);
                break;

        }
    }
}
