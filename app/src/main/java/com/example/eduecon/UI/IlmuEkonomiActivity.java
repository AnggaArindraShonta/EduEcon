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

public class IlmuEkonomiActivity extends AppCompatActivity {


    ConstraintLayout expandableView, expandableView1, expandableView2, expandableView3;
    Button arrowBtn, arrowBtn1, arrowBtn2, arrowBtn3;
    CardView cardView, cardView1, cardView2, cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilmu_ekonomi);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        expandableView = findViewById(R.id.expandableView);
        expandableView1 = findViewById(R.id.expandableView1);
        expandableView2 = findViewById(R.id.expandableView2);
        expandableView3 = findViewById(R.id.expandableView3);
        cardView = findViewById(R.id.cardView);
        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        arrowBtn = findViewById(R.id.arrowBtn);
        arrowBtn1 = findViewById(R.id.arrowBtn1);
        arrowBtn2 = findViewById(R.id.arrowBtn2);
        arrowBtn3 = findViewById(R.id.arrowBtn3);
        arrowBtn.setOnClickListener(v -> {
            if (expandableView.getVisibility()==View.GONE){
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
    }
}