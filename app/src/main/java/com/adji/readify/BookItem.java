package com.adji.readify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class BookItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_item);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void to_Order(View dsp) {
        Intent intent = new Intent(BookItem.this, Login.class);
        startActivity(intent);
    }
    public void to_Home1(View dsp) {
        Intent intent = new Intent(BookItem.this, BookList.class);
        startActivity(intent);
    }
}