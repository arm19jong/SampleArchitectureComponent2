package com.example.a23per.sanplearchitecturecomponent.handling.activity;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.a23per.sanplearchitecturecomponent.handling.MyLifecycle;
import com.example.a23per.sanplearchitecturecomponent.R;

/**
 * Created by 23per on 11/29/2017.
 */

public class SampleWithImplementsActivity extends Activity implements LifecycleOwner {
    private final LifecycleRegistry mRegistry = new LifecycleRegistry(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MyLifecycle(getLifecycle());
    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return this.mRegistry;
    }

}
