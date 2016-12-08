package com.android.fauziachmadharuna.recycleview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FauziAchmad on 11/27/16.
 */

public class AdapterBangunDatar extends RecyclerView.Adapter<AdapterBangunDatar.ViewHolderBangunDatar> {

    Context context;
    List<BangunDatar> bangunDatarList = new ArrayList<>();


    public AdapterBangunDatar(Context context, List<BangunDatar> bangunDatarList) {
        this.context = context;
        this.bangunDatarList = bangunDatarList;


    }

    public class ViewHolderBangunDatar extends RecyclerView.ViewHolder {

        CardView cvBangunDatar;
        ImageView ivBangunDatar;
        TextView tvBangunDatar;

        public ViewHolderBangunDatar(View itemView) {
            super(itemView);
            cvBangunDatar = (CardView) itemView.findViewById(R.id.cv_bangunDatar);
            ivBangunDatar = (ImageView) itemView.findViewById(R.id.iv_bangundatar);
            tvBangunDatar = (TextView) itemView.findViewById(R.id.tv_bangundatar);

        }
    }

    @Override
    public AdapterBangunDatar.ViewHolderBangunDatar onCreateViewHolder(ViewGroup parent, int viewType) {
        View bangunDatar = LayoutInflater.from(context).inflate(R.layout.card_bangun_datar, parent, false);
        ViewHolderBangunDatar viewHolderBangunDatar = new ViewHolderBangunDatar(bangunDatar);
        return viewHolderBangunDatar;
    }

    @Override
    public void onBindViewHolder(AdapterBangunDatar.ViewHolderBangunDatar holder, int position) {

        final String namaBangunDatar = bangunDatarList.get(position).getNamaBangun();
        int picBangunDatar = bangunDatarList.get(position).getPic();

        holder.tvBangunDatar.setText(namaBangunDatar);
        holder.ivBangunDatar.setImageResource(picBangunDatar);
        holder.cvBangunDatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (namaBangunDatar) {
                    case "Persegi":
                        Intent intent1 = new Intent(context, PersegiActivity.class);
                        context.startActivity(intent1);
                        break;
                    case "Persegi Panjang":
                        Intent intent2 = new Intent(context, PersegiPanjang.class);
                        context.startActivity(intent2);
                        break;
                    case "Segitiga":
                        Intent intent3 = new Intent(context, Segitiga.class);
                        context.startActivity(intent3);
                        break;
                    case "Lingkaran":
                        Intent intent4 = new Intent(context, lingkaran.class);
                        context.startActivity(intent4);
                        break;

                }

            }

        });
    }

    @Override
    public int getItemCount() {

        return bangunDatarList == null ? 0 : bangunDatarList.size();
    }
}
