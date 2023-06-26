package com.adji.readify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class BookList2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void to_Item1(View dsp) {
        Intent intent = new Intent(BookList2.this, BookItem2.class);
        startActivity(intent);
    }
    public void to_akun2(View dsp) {
        Intent intent = new Intent(BookList2.this, account.class);
        startActivity(intent);
    }
    public void to_Romance2(View dsp) {
        Intent intent = new Intent(BookList2.this, Romance2.class);
        startActivity(intent);
    }
}