package com.example.currentplacedetailsonmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void toMap(View view) {
        Intent intent = new Intent(MainActivity3.this,MapsActivityCurrentPlace.class);
        startActivity(intent);
    }
}