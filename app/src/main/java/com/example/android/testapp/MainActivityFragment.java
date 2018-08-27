package com.example.android.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivityFragment extends Fragment {
    public MainActivityFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_fragment, container, false);

        final int imageResource = R.drawable.ic_launcher_background;
        ImageView mainImage = (ImageView) rootView.findViewById(R.id.main_image);
        mainImage.setImageResource(imageResource);

        Button button = (Button) rootView.findViewById(R.id.main_button);
        button.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to open Google Maps with the specific address stored on a Location object
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra(Intent.EXTRA_INTENT, imageResource);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
