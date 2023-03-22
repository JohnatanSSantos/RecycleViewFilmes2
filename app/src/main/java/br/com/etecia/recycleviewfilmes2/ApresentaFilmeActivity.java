package br.com.etecia.recycleviewfilmes2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ApresentaFilmeActivity extends AppCompatActivity {

    TextView mTituloFilme, mCategoria, mSinopse;

    ImageView mImagemFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);

        mTituloFilme = findViewById(R.id.mTituloFilme);
        mCategoria = findViewById(R.id.mCategoria);
        mSinopse = findViewById(R.id.mSinopse);
        mImagemFilme = findViewById(R.id.mImagemFilme);

        Intent intent = getIntent();

        String titulo, categoria, sinopse;
        int imagemFilme;

        titulo = intent.getExtras().getString("Titulo");
        categoria = intent.getExtras().getString("Categoria");
        sinopse = intent.getExtras().getString("Sinopse");

        imagemFilme = intent.getExtras().getInt("ImagemFilme");

        mTituloFilme.setText(titulo);
        mCategoria.setText(categoria);
        mSinopse.setText(sinopse);
        mImagemFilme.setImageResource(imagemFilme);

    }
}