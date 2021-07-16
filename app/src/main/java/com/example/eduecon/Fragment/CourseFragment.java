package com.example.eduecon.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eduecon.R;
import com.example.eduecon.UI.Course.BankSentralActivity;
import com.example.eduecon.UI.Course.KonsepBadanUsahaActivity;
import com.example.eduecon.UI.Course.LembagaJasaKeuanganActivity;
import com.example.eduecon.UI.Course.BumnBumsBumdActivity;
import com.example.eduecon.UI.Course.DistribusiDanKonsumsiActivity;
import com.example.eduecon.UI.Course.AlatPembayaranActivity;
import com.example.eduecon.UI.Course.IlmuEkonomiActivity;
import com.example.eduecon.UI.Course.ManajemenActivity;
import com.example.eduecon.UI.Course.PengelolaanBadanUsahadanPerannyaActivity;
import com.example.eduecon.UI.Course.PerkoperasianActivity;
import com.example.eduecon.UI.Course.KeseimbanganPasarActivity;
import com.example.eduecon.UI.Course.MasalahEkonomiActivity;
import com.example.eduecon.UI.Course.SistemPembayaranActivity;
import com.example.eduecon.UI.Course.PasarModalActivity;
import com.example.eduecon.UI.Course.PermintaandanPenawaranActivity;
import com.example.eduecon.UI.Course.ProduksiKegiatanEkonomiActivity;
import com.example.eduecon.UI.Course.SistemEkonomiActivity;
import com.example.eduecon.UI.Course.StrukturPasarActivity;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class CourseFragment extends Fragment {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3};
    CardView m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_course, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        carouselView = view.findViewById(R.id.carouselView);
        carouselView.setImageListener(imageListener);
        carouselView.setPageCount(sampleImages.length);
        m1= view.findViewById(R.id.ilmuekonomi);
        m2= view.findViewById(R.id.alatpembayaran);
        m3= view.findViewById(R.id.bumn);
        m4= view.findViewById(R.id.masalahekonomi);
        m5= view.findViewById(R.id.sistemekonomi);
        m6= view.findViewById(R.id.sistempembayaran);
        m7= view.findViewById(R.id.distribusidankonsumsi);
        m8= view.findViewById(R.id.produksikegiatanekonomi);
        m9= view.findViewById(R.id.permintaandanpenawaran);
        m10= view.findViewById(R.id.pengelolaanbadanusaha);
        m11= view.findViewById(R.id.keseimbanganpasar);
        m12= view.findViewById(R.id.perkoperasian);
        m13= view.findViewById(R.id.banksentral);
        m14= view.findViewById(R.id.konsepbadanusaha);
        m15= view.findViewById(R.id.lembagajasakeuangan);
        m16= view.findViewById(R.id.strukturpasar);
        m17= view.findViewById(R.id.manajemen);
        m18= view.findViewById(R.id.pasarmodal);
        m1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IlmuEkonomiActivity.class);
            startActivity(intent);
        });
        m2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AlatPembayaranActivity.class);
            startActivity(intent);
        });
        m3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BumnBumsBumdActivity.class);
            startActivity(intent);
        });
        m4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), MasalahEkonomiActivity.class);
            startActivity(intent);
        });
        m5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SistemEkonomiActivity.class);
            startActivity(intent);
        });
        m6.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SistemPembayaranActivity.class);
            startActivity(intent);
        });
        m7.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DistribusiDanKonsumsiActivity.class);
            startActivity(intent);
        });
        m8.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ProduksiKegiatanEkonomiActivity.class);
            startActivity(intent);
        });
        m9.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PermintaandanPenawaranActivity.class);
            startActivity(intent);
        });
        m10.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PengelolaanBadanUsahadanPerannyaActivity.class);
            startActivity(intent);
        });
        m11.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KeseimbanganPasarActivity.class);
            startActivity(intent);
        });
        m12.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PerkoperasianActivity.class);
            startActivity(intent);
        });
        m13.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BankSentralActivity.class);
            startActivity(intent);
        });
        m14.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KonsepBadanUsahaActivity.class);
            startActivity(intent);
        });
        m15.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), LembagaJasaKeuanganActivity.class);
            startActivity(intent);
        });
        m16.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), StrukturPasarActivity.class);
            startActivity(intent);
        });
        m17.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ManajemenActivity.class);
            startActivity(intent);
        });
        m18.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PasarModalActivity.class);
            startActivity(intent);
        });
    }
    ImageListener imageListener = (position, imageView) -> imageView.setImageResource(sampleImages[position]);
}