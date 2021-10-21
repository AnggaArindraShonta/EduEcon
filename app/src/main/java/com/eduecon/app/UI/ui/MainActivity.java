package com.eduecon.app.UI.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import com.eduecon.app.Fragment.CourseFragment;
import com.eduecon.app.Fragment.EbookFragment;
import com.eduecon.app.Fragment.QuizFragment;
import com.eduecon.app.Fragment.VideoFragment;
import com.eduecon.app.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment = null;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        ChipNavigationBar chipNavigationBar = findViewById(R.id.chipNavigation);

        chipNavigationBar.setItemSelected(R.id.home, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new CourseFragment()).commit();

        chipNavigationBar.setOnItemSelectedListener(i -> {
            switch (i) {
                case R.id.home:
                    fragment = new CourseFragment();
                    break;
                case R.id.ebook:
                    fragment = new EbookFragment();
                    break;
                case R.id.assignment:
                    fragment = new QuizFragment();
                    break;
                case R.id.video:
                    fragment = new VideoFragment();
                    break;
            }

            if (fragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            }
        });
    }
}