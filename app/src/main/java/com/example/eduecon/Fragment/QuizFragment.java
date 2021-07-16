package com.example.eduecon.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.eduecon.Model.Constants;
import com.example.eduecon.R;
import com.example.eduecon.UI.Quiz.QuizActivity;

public class QuizFragment extends Fragment implements View.OnClickListener{

    CardView quiz1, quiz2, quiz3, quiz4, quiz5, quiz6, quiz7, quiz8, quiz9, quiz10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false);

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        quiz1= view.findViewById(R.id.quiz1);
        quiz2= view.findViewById(R.id.quiz2);
        quiz3= view.findViewById(R.id.quiz3);
        quiz4= view.findViewById(R.id.quiz4);
        quiz5= view.findViewById(R.id.quiz5);
        quiz6= view.findViewById(R.id.quiz6);
        quiz7= view.findViewById(R.id.quiz7);
        quiz8= view.findViewById(R.id.quiz8);
        quiz9= view.findViewById(R.id.quiz9);
        quiz10= view.findViewById(R.id.quiz10);

        quiz1.setOnClickListener(this);
        quiz2.setOnClickListener(this);
        quiz3.setOnClickListener(this);
        quiz4.setOnClickListener(this);
        quiz5.setOnClickListener(this);
        quiz6.setOnClickListener(this);
        quiz7.setOnClickListener(this);
        quiz8.setOnClickListener(this);
        quiz9.setOnClickListener(this);
        quiz10.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.quiz1:
                final Dialog dialog1 = new Dialog(getActivity());
                dialog1.setContentView(R.layout.start_dialog);
                Button btnstart1 = dialog1.findViewById(R.id.btnstart);
                btnstart1.setOnClickListener(v -> {
                    Intent q1Intent = new Intent(getActivity(), QuizActivity.class);
                    q1Intent.putExtra("Category", Constants.QUIZ1);
                    startActivity(q1Intent);
                });
                dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog1.show();
                break;
            case R.id.quiz2:
                final Dialog dialog2 = new Dialog(getActivity());
                dialog2.setContentView(R.layout.start_dialog);
                Button btnstart2 = dialog2.findViewById(R.id.btnstart);
                btnstart2.setOnClickListener(v -> {
                    Intent q1Intent = new Intent(getActivity(), QuizActivity.class);
                    q1Intent.putExtra("Category", Constants.QUIZ2);
                    startActivity(q1Intent);
                });
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog2.show();
                break;
            case R.id.quiz3:
                final Dialog dialog3 = new Dialog(getActivity());
                dialog3.setContentView(R.layout.start_dialog);
                Button btnstart3 = dialog3.findViewById(R.id.btnstart);
                btnstart3.setOnClickListener(v -> {
                    Intent q3Intent = new Intent(getActivity(), QuizActivity.class);
                    q3Intent.putExtra("Category", Constants.QUIZ3);
                    startActivity(q3Intent);
                });
                dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog3.show();
                break;
            case R.id.quiz4:
                final Dialog dialog4 = new Dialog(getActivity());
                dialog4.setContentView(R.layout.start_dialog);
                Button btnstart4 = dialog4.findViewById(R.id.btnstart);
                btnstart4.setOnClickListener(v -> {
                    Intent q4Intent = new Intent(getActivity(), QuizActivity.class);
                    q4Intent.putExtra("Category", Constants.QUIZ4);
                    startActivity(q4Intent);
                });
                dialog4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog4.show();
                break;
            case R.id.quiz5:
                final Dialog dialog5 = new Dialog(getActivity());
                dialog5.setContentView(R.layout.start_dialog);
                Button btnstart5 = dialog5.findViewById(R.id.btnstart);
                btnstart5.setOnClickListener(v -> {
                    Intent q5Intent = new Intent(getActivity(), QuizActivity.class);
                    q5Intent.putExtra("Category", Constants.QUIZ5);

                    startActivity(q5Intent);
                });
                dialog5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog5.show();
                break;
            case R.id.quiz6:
                final Dialog dialog6 = new Dialog(getActivity());
                dialog6.setContentView(R.layout.start_dialog);
                Button btnstart6 = dialog6.findViewById(R.id.btnstart);
                btnstart6.setOnClickListener(v -> {
                    Intent q6Intent = new Intent(getActivity(), QuizActivity.class);
                    q6Intent.putExtra("Category", Constants.QUIZ6);

                    startActivity(q6Intent);
                });
                dialog6.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog6.show();
                break;
            case R.id.quiz7:
                final Dialog dialog7 = new Dialog(getActivity());
                dialog7.setContentView(R.layout.start_dialog);
                Button btnstart7 = dialog7.findViewById(R.id.btnstart);
                btnstart7.setOnClickListener(v -> {
                    Intent q7Intent = new Intent(getActivity(), QuizActivity.class);
                    q7Intent.putExtra("Category", Constants.QUIZ7);

                    startActivity(q7Intent);
                });
                dialog7.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog7.show();
                break;
            case R.id.quiz8:
                final Dialog dialog8 = new Dialog(getActivity());
                dialog8.setContentView(R.layout.start_dialog);
                Button btnstart8 = dialog8.findViewById(R.id.btnstart);
                btnstart8.setOnClickListener(v -> {
                    Intent q8Intent = new Intent(getActivity(), QuizActivity.class);
                    q8Intent.putExtra("Category", Constants.QUIZ8);

                    startActivity(q8Intent);
                });
                dialog8.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog8.show();
                break;
            case R.id.quiz9:
                final Dialog dialog9 = new Dialog(getActivity());
                dialog9.setContentView(R.layout.start_dialog);
                Button btnstart9 = dialog9.findViewById(R.id.btnstart);
                btnstart9.setOnClickListener(v -> {
                    Intent q9Intent = new Intent(getActivity(), QuizActivity.class);
                    q9Intent.putExtra("Category", Constants.QUIZ9);

                    startActivity(q9Intent);
                });
                dialog9.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog9.show();
                break;
            case R.id.quiz10:
                final Dialog dialog10 = new Dialog(getActivity());
                dialog10.setContentView(R.layout.start_dialog);
                Button btnstart10 = dialog10.findViewById(R.id.btnstart);
                btnstart10.setOnClickListener(v -> {
                    Intent q10Intent = new Intent(getActivity(), QuizActivity.class);
                    q10Intent.putExtra("Category", Constants.QUIZ10);

                    startActivity(q10Intent);
                });
                dialog10.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog10.show();
                break;
        }
    }
}