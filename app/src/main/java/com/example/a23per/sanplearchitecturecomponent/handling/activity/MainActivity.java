package com.example.a23per.sanplearchitecturecomponent.handling.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.a23per.sanplearchitecturecomponent.handling.MyLifecycle;
import com.example.a23per.sanplearchitecturecomponent.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MyLifecycle(getLifecycle(), new MyLifecycle.MyListener() {
            @Override
            public void myText(String text) {
                Log.d("tag2", text);
            }
        });
    }

}
