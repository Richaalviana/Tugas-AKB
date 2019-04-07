package com.example.myapplication.;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

/*
 * Created By
 *
 *Nama    : Richa Alvianawati Sumitra
  NIM     : 10116525
  Kelas   : IF-12 / AKB-12
  Tanggal : 06 April 2019
 *
 * */
public class MainActivity extends AppCompatActivity {

    Button btn_Mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }

        btn_Mulai = (Button) findViewById(R.id.btnMulai);
        btn_Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginCode.class);
                startActivity(i);
            }
        });
    }
}
