package com.example.withroom;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pelicula {
    @PrimaryKey(autoGenerate = true)
    public int Id;
    public String Titulo;
    public String Genero;
    public int Anho;
    public String Director;
}
