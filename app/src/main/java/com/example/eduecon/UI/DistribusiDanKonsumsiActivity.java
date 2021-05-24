package com.example.eduecon.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.eduecon.R;

public class DistribusiDanKonsumsiActivity extends AppCompatActivity {
    ConstraintLayout expandableView, expandableView1, expandableView2, expandableView3, expandableView4, expandableView5, expandableView6, expandableView7, expandableView8, expandableView9, expandableView10, expandableView11, expandableView12;
    Button arrowBtn, arrowBtn1, arrowBtn2, arrowBtn3, arrowBtn4, arrowBtn5, arrowBtn6, arrowBtn7, arrowBtn8, arrowBtn9, arrowBtn10, arrowBtn11, arrowBtn12;
    CardView cardView, cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10, cardView11, cardView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribusi_dan_konsumsi);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        expandableView = findViewById(R.id.expandableView);
        expandableView1 = findViewById(R.id.expandableView1);
        expandableView2 = findViewById(R.id.expandableView2);
        expandableView3 = findViewById(R.id.expandableView3);
        expandableView4 = findViewById(R.id.expandableView4);
        expandableView5 = findViewById(R.id.expandableView5);
        expandableView6 = findViewById(R.id.expandableView6);
        expandableView7 = findViewById(R.id.expandableView7);
        expandableView8 = findViewById(R.id.expandableView8);
        expandableView9 = findViewById(R.id.expandableView9);
        expandableView10 = findViewById(R.id.expandableView10);
        expandableView11 = findViewById(R.id.expandableView11);
        expandableView12 = findViewById(R.id.expandableView12);
        cardView = findViewById(R.id.cardView);
        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        arrowBtn4 = findViewById(R.id.arrowBtn4);
        arrowBtn5 = findViewById(R.id.arrowBtn5);
        arrowBtn6 = findViewById(R.id.arrowBtn6);
        cardView7 = findViewById(R.id.cardView7);
        cardView8 = findViewById(R.id.cardView8);
        cardView9 = findViewById(R.id.cardView9);
        cardView10 = findViewById(R.id.cardView10);
        arrowBtn11 = findViewById(R.id.arrowBtn11);
        arrowBtn12 = findViewById(R.id.arrowBtn12);
        arrowBtn = findViewById(R.id.arrowBtn);
        arrowBtn1 = findViewById(R.id.arrowBtn1);
        arrowBtn2 = findViewById(R.id.arrowBtn2);
        arrowBtn3 = findViewById(R.id.arrowBtn3);
        cardView4 = findViewById(R.id.cardView4);
        cardView5 = findViewById(R.id.cardView5);
        cardView6 = findViewById(R.id.cardView6);
        arrowBtn7 = findViewById(R.id.arrowBtn7);
        arrowBtn8 = findViewById(R.id.arrowBtn8);
        arrowBtn9 = findViewById(R.id.arrowBtn9);
        arrowBtn10 = findViewById(R.id.arrowBtn10);
        cardView11 = findViewById(R.id.cardView11);
        cardView12 = findViewById(R.id.cardView12);
        arrowBtn.setOnClickListener(v -> {
            if (expandableView.getVisibility()== View.GONE){
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                expandableView.setVisibility(View.VISIBLE);
                arrowBtn.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                expandableView.setVisibility(View.GONE);
                arrowBtn.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn1.setOnClickListener(v -> {
            if (expandableView1.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                expandableView1.setVisibility(View.VISIBLE);
                arrowBtn.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                expandableView1.setVisibility(View.GONE);
                arrowBtn1.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn2.setOnClickListener(v -> {
            if (expandableView2.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                expandableView2.setVisibility(View.VISIBLE);
                arrowBtn2.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                expandableView2.setVisibility(View.GONE);
                arrowBtn2.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn3.setOnClickListener(v -> {
            if (expandableView3.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                expandableView3.setVisibility(View.VISIBLE);
                arrowBtn3.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                expandableView3.setVisibility(View.GONE);
                arrowBtn3.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn4.setOnClickListener(v -> {
            if (expandableView4.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                expandableView4.setVisibility(View.VISIBLE);
                arrowBtn4.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                expandableView4.setVisibility(View.GONE);
                arrowBtn4.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn5.setOnClickListener(v -> {
            if (expandableView5.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                expandableView5.setVisibility(View.VISIBLE);
                arrowBtn5.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                expandableView5.setVisibility(View.GONE);
                arrowBtn5.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn6.setOnClickListener(v -> {
            if (expandableView6.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                expandableView6.setVisibility(View.VISIBLE);
                arrowBtn6.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                expandableView6.setVisibility(View.GONE);
                arrowBtn6.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn7.setOnClickListener(v -> {
            if (expandableView7.getVisibility()== View.GONE){
                TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                expandableView7.setVisibility(View.VISIBLE);
                arrowBtn7.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                expandableView7.setVisibility(View.GONE);
                arrowBtn7.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn8.setOnClickListener(v -> {
            if (expandableView8.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                expandableView8.setVisibility(View.VISIBLE);
                arrowBtn8.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                expandableView8.setVisibility(View.GONE);
                arrowBtn8.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn9.setOnClickListener(v -> {
            if (expandableView9.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                expandableView9.setVisibility(View.VISIBLE);
                arrowBtn9.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                expandableView9.setVisibility(View.GONE);
                arrowBtn9.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn10.setOnClickListener(v -> {
            if (expandableView10.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                expandableView10.setVisibility(View.VISIBLE);
                arrowBtn10.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                expandableView10.setVisibility(View.GONE);
                arrowBtn10.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn11.setOnClickListener(v -> {
            if (expandableView11.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                expandableView11.setVisibility(View.VISIBLE);
                arrowBtn11.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                expandableView11.setVisibility(View.GONE);
                arrowBtn11.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
        arrowBtn12.setOnClickListener(v -> {
            if (expandableView12.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                expandableView12.setVisibility(View.VISIBLE);
                arrowBtn12.setBackgroundResource(R.drawable.ic_arrowup);
            } else {
                TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                expandableView12.setVisibility(View.GONE);
                arrowBtn12.setBackgroundResource(R.drawable.ic_arrowdown);
            }
        });
    }
}