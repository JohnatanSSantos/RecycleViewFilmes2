package br.com.etecia.recycleviewfilmes2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Coringa",
                        "'Coringa' é uma história independente e original. Arthur Fleck (Joaquin Phoenix), um homem ignorado pela sociedade, não é apenas um caso de estudo comportamental, mas uma lição de vida.",
                        "Drama, Suspense",
                        R.drawable.coringa));

        //Criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);
    }
}