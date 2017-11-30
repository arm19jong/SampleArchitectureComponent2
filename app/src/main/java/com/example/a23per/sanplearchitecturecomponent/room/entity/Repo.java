package com.example.a23per.sanplearchitecturecomponent.room.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by 23per on 11/30/2017.
 */

@Entity
public class Repo {
    @PrimaryKey
    public final int id;
    public final String name;
    public final String url;

    public Repo(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }
}
