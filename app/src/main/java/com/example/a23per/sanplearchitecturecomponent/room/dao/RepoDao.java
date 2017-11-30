package com.example.a23per.sanplearchitecturecomponent.room.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.database.Cursor;

import com.example.a23per.sanplearchitecturecomponent.room.entity.Repo;

import java.util.List;

/**
 * Created by 23per on 11/30/2017.
 */

@Dao
public interface RepoDao {

    @Query("SELECT * FROM repo")
    List<Repo> getAllRepos();

    @Query("SELECT * FROM repo")
    LiveData<List<Repo>> getAllReposLiveData();

    @Query("SELECT * FROM repo WHERE id=:id")
    Repo getRepo(int id);

    @Query("SELECT * FROM repo")
    Cursor getRepoCursor();

    @Insert
    void insert(Repo... repos);

    @Insert
    void insert(Repo repo);

    @Update
    void update(Repo... repos);

    @Delete
    void delete(Repo... repos);
}