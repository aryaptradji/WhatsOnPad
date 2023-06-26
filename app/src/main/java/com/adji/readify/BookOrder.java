package com.adji.readify;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BookOrder extends AppCompatActivity {
    FloatingActionButton fab;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_book);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomDialog();
            }
        });

    }
    public void to_home2(View dsp) {
        Intent intent = new Intent(BookOrder.this, BookList.class);
        startActivity(intent);
    }
    public void to_Pay(View dsp) {
        Intent intent = new Intent(BookOrder.this, BuyBook.class);
        startActivity(intent);
    }
    private void showBottomDialog() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.slide);

        CardView gopay = dialog.findViewById(R.id.gopay);
        CardView kredit = dialog.findViewById(R.id.kredit);
        CardView minimarket = dialog.findViewById(R.id.minimarket);
//        ImageView cancelButton = dialog.findViewById(R.id.cancelButton);
//
//        math.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                dialog.dismiss();
//                Toast.makeText(MateriMatematikaActivity.this,"Anda Sudah berada pada halaman ini",Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//        sains.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MateriMatematikaActivity.this, MateriSainsActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        sport.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MateriMatematikaActivity.this, MateriOlahragaActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//        cancelButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dialog.dismiss();
//            }
//        });

        dialog.show();
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
//        dialog.getWindow().setGravity(Gravity.BOTTOM);

    }
}
