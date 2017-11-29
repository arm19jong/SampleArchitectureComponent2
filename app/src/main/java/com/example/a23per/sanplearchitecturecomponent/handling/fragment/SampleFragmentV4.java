package com.example.a23per.sanplearchitecturecomponent.handling.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a23per.sanplearchitecturecomponent.handling.MyLifecycle;
import com.example.a23per.sanplearchitecturecomponent.R;
import com.example.a23per.sanplearchitecturecomponent.handling.activity.MainActivity;

/**
 * Created by 23per on 11/29/2017.
 */

public class SampleFragmentV4 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new MyLifecycle(getLifecycle());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
