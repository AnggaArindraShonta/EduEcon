package com.example.eduecon.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eduecon.R;
import com.example.eduecon.UI.BankActivity;
import com.example.eduecon.UI.BiayaPeluangActivity;
import com.example.eduecon.UI.DistribusiDanKonsumsiActivity;
import com.example.eduecon.UI.ElastisitasHargaActivity;
import com.example.eduecon.UI.IlmuEkonomiActivity;
import com.example.eduecon.UI.KelangkaanActivity;
import com.example.eduecon.UI.KeseimbanganPasarActivity;
import com.example.eduecon.UI.MasalahEkonomiActivity;
import com.example.eduecon.UI.ModelDiagramActivity;
import com.example.eduecon.UI.NonBankActivity;
import com.example.eduecon.UI.OtoritasJasaActivity;
import com.example.eduecon.UI.PasarModalActivity;
import com.example.eduecon.UI.PenawaranActivity;
import com.example.eduecon.UI.PermintaanActivity;
import com.example.eduecon.UI.ProduksiKegiatanEkonomiActivity;
import com.example.eduecon.UI.SistemEkonomiActivity;
import com.example.eduecon.UI.SistemEkonomiIndonesiaActivity;
import com.example.eduecon.UI.StrukturPasarActivity;
import com.example.eduecon.adapter.CourseAdapter;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class CourseFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Integer> images;
    private CourseAdapter courseAdapter;
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3};
//    CardView m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18;

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
        recyclerView = view.findViewById(R.id.recyclerview);

        courseAdapter = new CourseAdapter(this, images);

        images = new ArrayList<>();

        images.add(R.drawable.c1);
        images.add(R.drawable.c2);
        images.add(R.drawable.c3);
        images.add(R.drawable.c4);
        images.add(R.drawable.c5);
        images.add(R.drawable.c6);
        images.add(R.drawable.c7);
        images.add(R.drawable.c8);
        images.add(R.drawable.c9);
        images.add(R.drawable.c10);
        images.add(R.drawable.c11);
        images.add(R.drawable.c12);
        images.add(R.drawable.c13);
        images.add(R.drawable.c14);
        images.add(R.drawable.c15);
        images.add(R.drawable.c16);
        images.add(R.drawable.c17);
        images.add(R.drawable.c18);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this , 1 , GridLayoutManager.VERTICAL, false);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(courseAdapter);






//        m1= view.findViewById(R.id.ilmuekonomi);
//        m2= view.findViewById(R.id.kelangkaan);
//        m3= view.findViewById(R.id.biayapeluang);
//        m4= view.findViewById(R.id.masalahekonomi);
//        m5= view.findViewById(R.id.sistemekonomi);
//        m6= view.findViewById(R.id.sistemekonomiindonesia);
//        m7= view.findViewById(R.id.produksikegiatanekonomi);
//        m8= view.findViewById(R.id.distribusi);
//        m9= view.findViewById(R.id.modeldiagram);
//        m10= view.findViewById(R.id.permintaan);
//        m11= view.findViewById(R.id.penawaran);
//        m12= view.findViewById(R.id.keseimbanganpasar);
//        m13= view.findViewById(R.id.bank);
//        m14= view.findViewById(R.id.nonbank);
//        m15= view.findViewById(R.id.elastisitasharga);
//        m16= view.findViewById(R.id.strukturpasar);
//        m17= view.findViewById(R.id.otoritasjasa);
//        m18= view.findViewById(R.id.pasarmodal);
//        m1.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), IlmuEkonomiActivity.class);
//            startActivity(intent);
//        });
//        m2.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), KelangkaanActivity.class);
//            startActivity(intent);
//        });
//        m3.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), BiayaPeluangActivity.class);
//            startActivity(intent);
//        });
//        m4.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), MasalahEkonomiActivity.class);
//            startActivity(intent);
//        });
//        m5.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), SistemEkonomiActivity.class);
//            startActivity(intent);
//        });
//        m6.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), SistemEkonomiIndonesiaActivity.class);
//            startActivity(intent);
//        });
//        m7.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), ProduksiKegiatanEkonomiActivity.class);
//            startActivity(intent);
//        });
//        m8.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), DistribusiDanKonsumsiActivity.class);
//            startActivity(intent);
//        });
//        m9.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), ModelDiagramActivity.class);
//            startActivity(intent);
//        });
//        m10.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), PermintaanActivity.class);
//            startActivity(intent);
//        });
//        m11.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), PenawaranActivity.class);
//            startActivity(intent);
//        });
//        m12.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), KeseimbanganPasarActivity.class);
//            startActivity(intent);
//        });
//        m13.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), BankActivity.class);
//            startActivity(intent);
//        });
//        m14.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), NonBankActivity.class);
//            startActivity(intent);
//        });
//        m15.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), ElastisitasHargaActivity.class);
//            startActivity(intent);
//        });
//        m16.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), StrukturPasarActivity.class);
//            startActivity(intent);
//        });
//        m17.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), OtoritasJasaActivity.class);
//            startActivity(intent);
//        });
//        m18.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), PasarModalActivity.class);
//            startActivity(intent);
//        });
    }
    ImageListener imageListener = (position, imageView) -> imageView.setImageResource(sampleImages[position]);
}