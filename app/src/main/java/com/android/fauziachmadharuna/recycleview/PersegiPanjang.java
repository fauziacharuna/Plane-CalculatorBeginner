package com.android.fauziachmadharuna.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersegiPanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang_activity);
        Button backButton=(Button) findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(v.getContext(), MainActivity.class);
                startActivity(menu);
            }
        });


        final EditText etSisi = (EditText) findViewById(R.id.et_sisipersegipanjang);
        final EditText etLebar = (EditText) findViewById(R.id.et_sisiLebarPersegiPanjang);
        Button btnHitung = (Button) findViewById(R.id.btnhasil);
        Button btnReset = (Button) findViewById(R.id.btnreset);
        final TextView tvLuas = (TextView) findViewById(R.id.tv_luasPersegiPanjang);
        final TextView tvKeliling = (TextView) findViewById(R.id.tv_kelilingPersegiPanjang);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSisi.setText("");
                etLebar.setText("");
                tvKeliling.setText("");
                tvLuas.setText("");
            }
        });

        btnHitung.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilaiPanjangString = etSisi.getText().toString();
                String nilaiLebarString = etLebar.getText().toString();
                if(TextUtils.isEmpty(etSisi.getText())||TextUtils.isEmpty(etLebar.getText())){
                    Toast.makeText(PersegiPanjang.this, "Nilai yang dimasukkan tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

                else if (nilaiPanjangString != null && nilaiLebarString != null) {
                    float panjang = Float.parseFloat(nilaiPanjangString);
                    float lebar = Float.parseFloat(nilaiLebarString);

                    tvLuas.setText("LUAS PERSEGI PANJANG = " + String.valueOf(hitungLuas(panjang, lebar)));
                    tvKeliling.setText("KELILING PERSEGI PANJANG = " + String.valueOf(hitungKeliling(panjang, lebar)));
                }
            }
        });

    }

    float hitungLuas(float panjang, float lebar) {
        float luas = panjang * lebar;
        return luas;

    }

    float hitungKeliling(float panjang, float lebar) {
        float keliling = (float) 2 * panjang + 2 * lebar;
        return keliling;
    }
}
