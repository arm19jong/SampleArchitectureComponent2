package com.example.a23per.sanplearchitecturecomponent.livedata;

import android.arch.lifecycle.LiveData;

/**
 * Created by 23per on 11/29/2017.
 */

public class MyLiveData extends LiveData<String> {
    @Override
    protected void onActive() {
        for (int i = 0;i<10;i++){
            setValue(i+"");
        }
    }

    @Override
    protected void onInactive() {}
}
