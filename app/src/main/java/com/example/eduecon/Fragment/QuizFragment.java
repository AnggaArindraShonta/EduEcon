package com.example.eduecon.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eduecon.R;
import com.example.eduecon.UI.Quiz1Activity;
import com.example.eduecon.UI.Quiz2Activity;
import com.example.eduecon.UI.Quiz3Activity;
import com.example.eduecon.UI.Quiz4Activity;
import com.example.eduecon.UI.Quiz5Activity;
import com.example.eduecon.UI.Quiz6Activity;
import com.example.eduecon.UI.Quiz7Activity;
import com.example.eduecon.UI.Quiz8Activity;

public class QuizFragment extends Fragment {

    CardView quiz1, quiz2, quiz3, quiz4, quiz5, quiz6, quiz7, quiz8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false);

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        quiz1= view.findViewById(R.id.quiz1);
        quiz1.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz1Activity.class);
            startActivity(intent);
        });
        quiz2= view.findViewById(R.id.quiz2);
        quiz2.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz2Activity.class);
            startActivity(intent);
        });
        quiz3= view.findViewById(R.id.quiz3);
        quiz3.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz3Activity.class);
            startActivity(intent);
        });
        quiz4= view.findViewById(R.id.quiz4);
        quiz4.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz4Activity.class);
            startActivity(intent);
        });
        quiz5= view.findViewById(R.id.quiz5);
        quiz5.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz5Activity.class);
            startActivity(intent);
        });
        quiz6= view.findViewById(R.id.quiz6);
        quiz6.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz6Activity.class);
            startActivity(intent);
        });
        quiz7= view.findViewById(R.id.quiz7);
        quiz7.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz7Activity.class);
            startActivity(intent);
        });
        quiz8= view.findViewById(R.id.quiz8);
        quiz8.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Quiz8Activity.class);
            startActivity(intent);
        });
    }
}