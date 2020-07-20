package com.example.withroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Pelicula.class}, version = 1)
public abstract class PeliculaDatabase extends RoomDatabase {
    protected abstract PeliculaDAO peliculaDAO();
}
