package com.example.withroom;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PeliculaDAO {
    @Query("SELECT * FROM Pelicula")
    List<Pelicula> traerPeliculas();

    @Insert
    void GuardarPelicula(Pelicula pelicula);
}
