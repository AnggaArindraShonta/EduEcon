package com.example.eduecon.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.eduecon.Model.Ebook;
import com.example.eduecon.R;
import com.example.eduecon.Adapter.EbookAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class EbookFragment extends Fragment {

    private RecyclerView ebookRecycler;
    private DatabaseReference reference;
    private List<Ebook> list;
    private EbookAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ebook, container, false);

        ebookRecycler = view.findViewById(R.id.rvEbook);
        reference = FirebaseDatabase.getInstance().getReference().child("pdf");

        getData();
        return view;
    }

    private void getData() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Ebook ebook = snapshot.getValue(Ebook.class);
                    list.add(ebook);
                }
                adapter = new EbookAdapter(getContext(), list);
                ebookRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
                ebookRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}