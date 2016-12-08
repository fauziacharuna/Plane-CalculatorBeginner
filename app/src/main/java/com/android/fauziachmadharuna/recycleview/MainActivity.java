package com.android.fauziachmadharuna.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvBangundatar = (RecyclerView) findViewById(R.id.rv_bangundatar);

        List<BangunDatar> bangunDatarList = new ArrayList<>();

        BangunDatar persegi = new BangunDatar();
        persegi.setNamaBangun("Persegi");
        persegi.setPic(R.drawable.persegi);
        bangunDatarList.add(persegi);

        BangunDatar persegiPanjang = new BangunDatar();
        persegiPanjang.setNamaBangun("Persegi Panjang");
        persegiPanjang.setPic(R.drawable.persegipanjang);
        bangunDatarList.add(persegiPanjang);

        BangunDatar segitiga = new BangunDatar();
        segitiga.setNamaBangun("Segitiga");
        segitiga.setPic(R.drawable.segitiga);
        bangunDatarList.add(segitiga);

        BangunDatar lingkaran = new BangunDatar();
        lingkaran.setNamaBangun("Lingkaran");
        lingkaran.setPic(R.drawable.lingkaran);
        bangunDatarList.add(lingkaran);


        AdapterBangunDatar adapterBangunDatar = new AdapterBangunDatar(this, bangunDatarList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvBangundatar.setLayoutManager(linearLayoutManager);
        rvBangundatar.setHasFixedSize(true);
        rvBangundatar.setAdapter(adapterBangunDatar);

    }
}
