package com.example.a23per.sanplearchitecturecomponent.room.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import com.example.a23per.sanplearchitecturecomponent.room.dao.RepoDao;
import com.example.a23per.sanplearchitecturecomponent.room.entity.Repo;

/**
 * Created by 23per on 11/30/2017.
 */

@Database(entities = { Repo.class }, version = 1)
public abstract class RepoDatabase extends RoomDatabase {

    private static final String DB_NAME = "repoDatabase.db";
    private static volatile RepoDatabase instance;

    public static synchronized RepoDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static RepoDatabase create(final Context context) {
        return Room.databaseBuilder(
                context,
                RepoDatabase.class,
                DB_NAME).allowMainThreadQueries().build();
    }

    public abstract RepoDao getRepoDao();
}
