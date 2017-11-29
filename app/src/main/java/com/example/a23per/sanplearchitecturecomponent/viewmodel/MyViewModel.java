package com.example.a23per.sanplearchitecturecomponent.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.Handler;

/**
 * Created by 23per on 11/29/2017.
 */

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> model = null;

    public MutableLiveData<String> getModel(){
        if(model==null){
            model = new MutableLiveData<>();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Do something after 5000ms
                    model.setValue("a");

                }
            }, 5000);
        }

        return model;
    }
}
