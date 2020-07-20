package com.example.withroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvDatos = findViewById(R.id.textDatos);
        tvDatos.setText("");

        PeliculaLab mPeliculaLab = PeliculaLab.get(this);
        List<Pelicula> peliculaList = mPeliculaLab.traerPeliculas();
        for(Pelicula pelicula : peliculaList){
            tvDatos.append("ID:" + pelicula.Id + "\n" +
                           "Titulo: " + pelicula.Titulo + "\n"+
                           "Director: " + pelicula.Director + "\n"+
                           "Año: " + pelicula.Anho + "\n"+
                           "Genero: " + pelicula.Genero + "\n\n");
        }




    }
}