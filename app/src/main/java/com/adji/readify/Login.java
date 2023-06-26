package com.adji.readify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }
    public void to_Order(View dsp){
        Intent intent = new Intent(Login.this,BookOrder.class);
        startActivity(intent);
    }
    public void to_Register(View dsp){
        Intent intent = new Intent(Login.this,Register.class);
        startActivity(intent);
    }
}