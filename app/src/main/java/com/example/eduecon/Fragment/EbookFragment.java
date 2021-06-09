package com.example.eduecon.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.eduecon.R;
import com.example.eduecon.UI.BadanUsahaActivity;
import com.example.eduecon.UI.BankSentralActivity;
import com.example.eduecon.UI.BiayaPeluangActivity;
import com.example.eduecon.UI.DistribusiDanKonsumsiActivity;
import com.example.eduecon.UI.IlmuEkonomiActivity;
import com.example.eduecon.UI.KDActivity1;
import com.example.eduecon.UI.KDActivity2;
import com.example.eduecon.UI.KelangkaanActivity;
import com.example.eduecon.UI.ManajemenActivity;
import com.example.eduecon.UI.MasalahEkonomiActivity;
import com.example.eduecon.UI.MasalahPokokActivity;
import com.example.eduecon.UI.PerkoperasianActivity;
import com.example.eduecon.UI.ProduksiKegiatanEkonomiActivity;
import com.example.eduecon.UI.SIActivity;
import com.example.eduecon.UI.SistemEkonomiActivity;
import com.example.eduecon.UI.SistemEkonomiIndonesiaActivity;

public class EbookFragment extends Fragment {

    ImageView m1, m2, m3, m4, m5, m6, m7, m8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ebook, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        m1= view.findViewById(R.id.banksentral);
        m2= view.findViewById(R.id.badanusaha);
        m3= view.findViewById(R.id.perkoperasian);
        m4= view.findViewById(R.id.manajemen);
        m5= view.findViewById(R.id.kd1);
        m6= view.findViewById(R.id.kd2);
        m7= view.findViewById(R.id.masalahpokok);
        m8= view.findViewById(R.id.si);
        m1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BankSentralActivity.class);
            startActivity(intent);
        });
        m2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BadanUsahaActivity.class);
            startActivity(intent);
        });
        m3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PerkoperasianActivity.class);
            startActivity(intent);
        });
        m4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ManajemenActivity.class);
            startActivity(intent);
        });
        m5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KDActivity1.class);
            startActivity(intent);
        });
        m6.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KDActivity2.class);
            startActivity(intent);
        });
        m7.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), MasalahPokokActivity.class);
            startActivity(intent);
        });
        m8.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SIActivity.class);
            startActivity(intent);
        });
    }
}