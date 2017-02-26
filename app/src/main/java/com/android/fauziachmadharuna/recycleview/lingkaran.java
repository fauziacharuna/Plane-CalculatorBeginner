package com.android.fauziachmadharuna.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran_activity);
        Button backButton=(Button) findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu= new Intent(v.getContext(),MainActivity.class);
                startActivity(menu);
            }
        });
        final EditText etJarijari = (EditText) findViewById(R.id.et_jari);
        Button btnHitung = (Button) findViewById(R.id.btnhasil);
        Button btnReset = (Button) findViewById(R.id.btnreset);
        final TextView tvLuas = (TextView) findViewById(R.id.tv_luaslingkaran);
        final TextView tvKeliling = (TextView) findViewById(R.id.tv_kelilinglingkaran);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etJarijari.setText("");
                tvLuas.setText("");
                tvKeliling.setText("");
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariString = etJarijari.getText().toString();
                if(TextUtils.isEmpty(etJarijari.getText())){
                    Toast.makeText(lingkaran.this,"Nilai yang dimasukkan tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

                else if (jariString != null) {
                    float jari = Float.parseFloat(jariString);

                    tvLuas.setText("LUAS LINGKARAN = " + String.valueOf(hitungLuas(jari)));
                    tvKeliling.setText("KELILING LINGKARAN = " + String.valueOf(hitungKeliling(jari)));
                }
            }
        });

    }

    float hitungLuas(float jari) {
        float luas = (float) 3.14 * jari*jari;
        return luas;

    }

    float hitungKeliling(float jari) {
        float keliling = (float) (2 * 3.14 * jari);
        return keliling;
    }
}

