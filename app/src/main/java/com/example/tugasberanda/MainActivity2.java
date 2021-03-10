package com.example.tugasberanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void activity4(View view){
        Intent a = new Intent( MainActivity2.this, MainActivity.class);
        startActivity(a);
        Toast.makeText(this,"Back To Beranda", Toast.LENGTH_SHORT).show();
    }

    public void activity5(View view){
        Intent b = new Intent( MainActivity2.this, MainActivity3.class);
        startActivity(b);
        Toast.makeText(this,"Biodata Mahasiswa", Toast.LENGTH_SHORT).show();
    }

}