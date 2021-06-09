package com.example.eduecon.utils;

import android.view.View;

public interface RecyclerViewCallback {
    interface ItemClick<Data> {
        void onItemClick(View view, Data data, int position);
    }
}
