package com.adji.readify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class BookList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }
    public void to_Item(View dsp){
        Intent intent = new Intent(BookList.this,BookItem.class);
        startActivity(intent);
    }
    public void to_Romance(View dsp){
        Intent intent = new Intent(BookList.this,Romance.class);
        startActivity(intent);
    }
    public void to_Login1(View dsp){
        Intent intent = new Intent(BookList.this,Login2.class);
        startActivity(intent);
    }

}