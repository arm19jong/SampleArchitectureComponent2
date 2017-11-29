package com.example.a23per.sanplearchitecturecomponent.handling;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import static android.arch.lifecycle.Lifecycle.Event.ON_ANY;
import static android.arch.lifecycle.Lifecycle.Event.ON_CREATE;
import static android.arch.lifecycle.Lifecycle.Event.ON_DESTROY;
import static android.arch.lifecycle.Lifecycle.Event.ON_PAUSE;
import static android.arch.lifecycle.Lifecycle.Event.ON_RESUME;
import static android.arch.lifecycle.Lifecycle.Event.ON_START;
import static android.arch.lifecycle.Lifecycle.Event.ON_STOP;
import static android.content.ContentValues.TAG;

/**
 * Created by 23per on 11/29/2017.
 */

public class MyLifecycle implements LifecycleObserver {
    private Lifecycle lifecycle;
    private MyListener myListener;
    public MyLifecycle(Lifecycle lifecycle){
        this.lifecycle = lifecycle;
        lifecycle.addObserver(this);
    }
    public MyLifecycle(Lifecycle lifecycle, MyListener myListener){
        this.lifecycle = lifecycle;
        this.myListener = myListener;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(ON_CREATE)
    public void create() {
        Log.d("tag2", "create");
        myListener.myText("createLis");
    }

    @OnLifecycleEvent(ON_START)
    public void start() {
        Log.d("tag2", "start");
        myListener.myText("startLis");
    }

    @OnLifecycleEvent(ON_RESUME)
    public void resume() {
        Log.d("tag2", "resume");
    }

    @OnLifecycleEvent(ON_PAUSE)
    public void pause() {
        Log.d("tag2", "pause");
    }

    @OnLifecycleEvent(ON_STOP)
    public void stop() {
        Log.d("tag2", "stop");
    }

    @OnLifecycleEvent(ON_DESTROY)
    public void cleanup() {
        Log.d("tag2", "destroy");
        lifecycle.removeObserver(this);
    }

    @OnLifecycleEvent(ON_ANY)
    public void any() {
        Log.d("tag2", "any");
    }

    public interface MyListener {
        void myText(String text);
    }

}
