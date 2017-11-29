package com.example.a23per.sanplearchitecturecomponent.viewmodel.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.a23per.sanplearchitecturecomponent.R;
import com.example.a23per.sanplearchitecturecomponent.viewmodel.MyViewModel;

/**
 * Created by 23per on 11/29/2017.
 */

public class MainViewModel extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewModelProviders.of(this)
                .get(MyViewModel.class)
                .getModel()
                .observe(this, new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        Log.d("tag2", s);
                    }
                });
    }
}
