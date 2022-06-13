package com.example.currentplacedetailsonmap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity5 extends Activity {

    EditText editTextName ;
    EditText editTextTextPersonName2 ;
    EditText editTextTextPersonName3 ;
    EditText editTextTextPersonName4 ;
    SharedPreferences now ;
    String info ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
//        editTextName = findViewById(R.id.editTextName);
//        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
//        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
//        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
    }


//    public void getText(View view) {
//        info = editTextName.getText().toString();
//        now = getSharedPreferences(info,MODE_PRIVATE);
//        now.edit().putString("Name",info).commit();
//        info = editTextTextPersonName2.getText().toString();
//        now.edit().putString("place",info).commit();
//        info = editTextTextPersonName3.getText().toString();
//        now.edit().putString("phone",info).commit();
//        info = editTextTextPersonName4.getText().toString();
//        now.edit().putString("comment",info).commit();
//        Intent intent = new Intent(MainActivity5.this,MainActivity4.class);
//        startActivity(intent);
//    }
}