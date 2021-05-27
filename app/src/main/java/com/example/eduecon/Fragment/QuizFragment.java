package com.example.eduecon.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.eduecon.R;
import com.example.eduecon.UI.QuizActivity;

public class QuizFragment extends Fragment {

    ImageView quiz;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false);

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        quiz= view.findViewById(R.id.quiz);
        quiz.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), QuizActivity.class);
            startActivity(intent);
        });
    }
}