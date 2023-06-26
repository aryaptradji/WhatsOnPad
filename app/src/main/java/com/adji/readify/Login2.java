package com.adji.readify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class Login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }
    public void to_List2(View dsp){
        Intent intent = new Intent(Login2.this,BookList2.class);
        startActivity(intent);
    }
    public void to_Register2(View dsp){
        Intent intent = new Intent(Login2.this,Register2.class);
        startActivity(intent);
    }

}