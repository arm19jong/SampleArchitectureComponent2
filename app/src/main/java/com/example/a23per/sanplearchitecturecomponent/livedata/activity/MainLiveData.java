package com.example.a23per.sanplearchitecturecomponent.livedata.activity;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.a23per.sanplearchitecturecomponent.R;
import com.example.a23per.sanplearchitecturecomponent.livedata.MyLiveData;

/**
 * Created by 23per on 11/29/2017.
 */

public class MainLiveData extends AppCompatActivity {
    MutableLiveData<String> s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLiveData myLiveData = new MyLiveData();
        myLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.d("tag2", s);
            }
        });

        s = new MutableLiveData<>();
        s.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.d("tag3", s);

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int i = 0; i<5; i++){
            s.setValue(s.getValue()+i);
        }
        for (int i = 0; i<5; i++){
            s.setValue(i+"");
        }
    }
}
