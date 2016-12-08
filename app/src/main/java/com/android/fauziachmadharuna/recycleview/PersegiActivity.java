package com.android.fauziachmadharuna.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersegiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_activity);

        final EditText etSisi = (EditText) findViewById(R.id.et_sisipersegi);
        Button btnHitung = (Button) findViewById(R.id.btnhasil);
        Button btnReset = (Button) findViewById(R.id.btnreset);
        final TextView tvLuas = (TextView) findViewById(R.id.tv_luaspersegi);
        final TextView tvKeliling = (TextView) findViewById(R.id.tv_kelilingpersegi);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSisi.setText("");
                tvKeliling.setText("");
                tvLuas.setText("");
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilaiString = etSisi.getText().toString();


                if (nilaiString != null) {
                    float sisi = Float.parseFloat(nilaiString);

                    tvLuas.setText("LUAS PERSEGI = " + String.valueOf(hitungLuas(sisi)));
                    tvKeliling.setText("KELILING PERSEGI = " + String.valueOf(hitungKeliling(sisi)));
                }
            }
        });

    }

    float hitungLuas(float sisi) {
        float luas = sisi * sisi;
        return luas;

    }

    float hitungKeliling(float sisi) {
        float keliling = (float) 4 * sisi;
        return keliling;
    }
}
