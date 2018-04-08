package com.example.administrator.simple_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void btnRead(View view) {
        startActivity(new Intent(this, Read.class));
    }
    public void btnWrite(View view) {
            startActivity(new Intent(this, Write.class));
    }
    public void btnHistory(View view) {
        startActivity(new Intent(this, History.class));
    }
}
