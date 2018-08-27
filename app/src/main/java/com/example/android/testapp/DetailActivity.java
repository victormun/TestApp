package com.example.android.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String key = "Key";
        int res = getIntent().getIntExtra(Intent.EXTRA_INTENT, 0);

        Bundle bundle = new Bundle();
        bundle.putInt(key, res);

        DetailActivityFragment1 fragment1 = new DetailActivityFragment1();
        DetailActivityFragment2 fragment2 = new DetailActivityFragment2();

        fragment1.setArguments(bundle);

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.detail_container_1, fragment1);
        transaction.add(R.id.detail_container_2, fragment2);

        transaction.commit();
    }
}
