package com.example.a23per.sanplearchitecturecomponent.handling.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.a23per.sanplearchitecturecomponent.R;
import com.example.a23per.sanplearchitecturecomponent.handling.fragment.SampleFragment;
import com.example.a23per.sanplearchitecturecomponent.handling.fragment.SampleFragmentV4;

/**
 * Created by 23per on 11/29/2017.
 */

public class SampleFragmentActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }


    void addFragmentV4(){

        SampleFragmentV4 fragment = new SampleFragmentV4();
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment, fragment);
        transaction.commit();
    }
    void addFragment() {
        SampleFragment fragment = new SampleFragment();
        android.app.FragmentManager manager = getFragmentManager();
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment, fragment);
        transaction.commit();
    }

}
