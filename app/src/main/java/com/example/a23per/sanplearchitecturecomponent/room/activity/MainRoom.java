package com.example.a23per.sanplearchitecturecomponent.room.activity;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a23per.sanplearchitecturecomponent.R;
import com.example.a23per.sanplearchitecturecomponent.room.database.RepoDatabase;
import com.example.a23per.sanplearchitecturecomponent.room.entity.Repo;

import java.util.List;

/**
 * Created by 23per on 11/30/2017.
 */

public class MainRoom extends AppCompatActivity{
    Button insert, all, allData;
    EditText id, name, url;
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);


        insert = findViewById(R.id.insert);
        all = findViewById(R.id.all);
        allData = findViewById(R.id.allData);
        text = findViewById(R.id.text);
        id = findViewById(R.id.id);
        name = findViewById(R.id.name);
        url = findViewById(R.id.url);


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RepoDatabase
                        .getInstance(MainRoom.this)
                        .getRepoDao()
                        .insert(new Repo(Integer.parseInt(id.getText().toString()), name.getText().toString(), url.getText().toString()));
            }
        });

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Repo> allRepos = RepoDatabase
                        .getInstance(MainRoom.this)
                        .getRepoDao()
                        .getAllRepos();
                String s = "";
                for (Repo r:allRepos) {
                    s += String.format("id:%d, name:%s, url:%s\n", r.id, r.name, r.url);
                }
                text.setText(s);
            }
        });

        allData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final LiveData<List<Repo>> allRepos = RepoDatabase
                        .getInstance(MainRoom.this)
                        .getRepoDao()
                        .getAllReposLiveData();
                allRepos.observe(MainRoom.this, new Observer<List<Repo>>() {
                    @Override
                    public void onChanged(@Nullable List<Repo> repos) {
                        String s = "";
                        for (Repo r:allRepos.getValue()) {
                            s += String.format("id:%d, name:%s, url:%s\n", r.id, r.name, r.url);
                        }
                        text.setText(s);

                    }
                });
            }
        });
    }
}
