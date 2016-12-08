package com.android.fauziachmadharuna.recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.android.fauziachmadharuna.recycleview.R.id.btnhasil;
import static com.android.fauziachmadharuna.recycleview.R.id.btnreset;
import static com.android.fauziachmadharuna.recycleview.R.id.et_alasSegitiga;
import static com.android.fauziachmadharuna.recycleview.R.id.et_miringSegitiga;
import static com.android.fauziachmadharuna.recycleview.R.id.et_tinggiSegitiga;
import static com.android.fauziachmadharuna.recycleview.R.id.tv_luasSegitiga;

/**
 * Created by FauziAchmad on 12/7/16.
 */

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga_activity);
        final EditText etAlas = (EditText) findViewById(R.id.et_alasSegitiga);
        final EditText etTinggi = (EditText) findViewById(R.id.et_tinggiSegitiga);
        final EditText etMiring = (EditText) findViewById(R.id.et_miringSegitiga);
        Button btnReset = (Button) findViewById(R.id.btnreset);
        Button btnHitung = (Button) findViewById(R.id.btnhitung);
        final TextView tvLuas = (TextView) findViewById(R.id.tv_luasSegitiga);
        final TextView tvKeliling = (TextView) findViewById(R.id.tv_kelilingSegitiga);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etAlas.setText("");
                etMiring.setText("");
                etTinggi.setText("");
                tvLuas.setText("");
                tvKeliling.setText("");
            }
        });


        btnHitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nilaiAlasString = etAlas.getText().toString();
                String nilaiTinggiString = etTinggi.getText().toString();
                String nilaiMiringString = etMiring.getText().toString();


                if (nilaiAlasString != null && nilaiTinggiString != null && nilaiMiringString != null) {
                    double alas = Float.parseFloat(nilaiAlasString);
                    double tinggi = Float.parseFloat(nilaiTinggiString);
                    double miring = Float.parseFloat(nilaiMiringString);


                    tvLuas.setText("LUAS SEGITIGA = " + String.valueOf(hitungLuas(alas, tinggi)));
                    tvKeliling.setText("KELILING SEGITIGA = " + String.valueOf(hitungKeliling(alas, tinggi, miring)));
                }
            }
        });
    }


    double hitungLuas(double alas, double tinggi) {
        double luas = (double) 0.5 * alas * tinggi;
        return luas;
    }

    double hitungKeliling(double alas, double tinggi, double miring) {
        double keliling = alas + miring + tinggi;
        return keliling;
    }

}







