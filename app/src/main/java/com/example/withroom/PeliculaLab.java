package com.example.withroom;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

public class PeliculaLab {
    private static PeliculaLab sPeliculaLab;
    private PeliculaDAO mPeliculaDAO;

    private PeliculaLab(Context context){
        Context appContext = context.getApplicationContext();
        PeliculaDatabase peliculaDatabase = Room.databaseBuilder(appContext,
                PeliculaDatabase.class, "peliculas.db").
                allowMainThreadQueries().build();
        mPeliculaDAO = peliculaDatabase.peliculaDAO();
    }

    public static PeliculaLab get(Context context){
        if (sPeliculaLab == null){
            sPeliculaLab = new PeliculaLab((context));
        }
        return sPeliculaLab;
    }

    public List<Pelicula> traerPeliculas(){
        return mPeliculaDAO.traerPeliculas();
    }

    public void GuardarPelicula(Pelicula pelicula){
        mPeliculaDAO.GuardarPelicula(pelicula);
    }

}
