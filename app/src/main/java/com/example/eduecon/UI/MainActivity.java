package com.example.eduecon.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.eduecon.Fragment.CourseFragment;
import com.example.eduecon.Fragment.EbookFragment;
import com.example.eduecon.Fragment.QuizFragment;
import com.example.eduecon.Fragment.VideoFragment;
import com.example.eduecon.R;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_course));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_ebook));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_assignment));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_video));

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {

                Fragment fragment = null;

                switch (item.getId()){
                    case 1:
                        fragment = new CourseFragment();
                        break;
                    case 2:
                        fragment = new EbookFragment();
                        break;
                    case 3:
                        fragment = new QuizFragment();
                        break;
                    case 4:
                        fragment = new VideoFragment();
                        break;
                }
                loadFragment(fragment);
            }
        });
        bottomNavigation.show(1, true);

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
            //    Toast.makeText(getApplicationContext(), "You Clicked" + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
            //    Toast.makeText(getApplicationContext(), "You Reselected" + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
    }
}