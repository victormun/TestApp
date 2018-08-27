package com.example.android.testapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class DetailActivityFragment1 extends Fragment {
    public DetailActivityFragment1() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_fragment_1, container, false);

        String key = "Key";

        if (!getArguments().isEmpty()) {
            int inheritedInt = getArguments().getInt(key);
            ImageView detailImage = (ImageView) rootView.findViewById(R.id.detail_image);
            detailImage.setImageResource(inheritedInt);
        }
        return rootView;
    }
}
