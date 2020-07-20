package com.example.withroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GuardarActivity extends AppCompatActivity {

    EditText etTitulo, etDirector, etAnho, etGenero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        etTitulo = findViewById(R.id.etTitulo);
        etDirector = findViewById(R.id.etDirector);
        etAnho = findViewById(R.id.etAnho);
        etGenero = findViewById(R.id.etGenero);



    }

    public void GuardarDatos(View view) {
        PeliculaLab mPeliculaLab = PeliculaLab.get(this);

        Pelicula pelicula1 = new Pelicula();
        pelicula1.Titulo = etTitulo.getText().toString();
        pelicula1.Genero = etGenero.getText().toString();
        try{
            pelicula1.Anho = Integer.parseInt(etAnho.getText().toString());
        } catch(NumberFormatException ex){
            Log.i("error", ex.getMessage());
        }
        pelicula1.Director = etDirector.getText().toString();
        mPeliculaLab.GuardarPelicula(pelicula1);
        Toast.makeText(this, "Pelicula guardada", Toast.LENGTH_LONG).show();
    }

    public void VerPeliculas(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}