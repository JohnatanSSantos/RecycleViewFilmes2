package br.com.etecia.recycleviewfilmes2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;


    //Declarar o recycler view
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //Criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Coringa",
                        "'Coringa' é uma história independente e original. Arthur Fleck (Joaquin Phoenix), um homem ignorado pela sociedade, não é apenas um caso de estudo comportamental, mas uma lição de vida.",
                        "Drama, Suspense",
                        R.drawable.coringa));
        listaFilmes.add(
                new Filmes("Coringa",
                        "'Coringa' é uma história independente e original. Arthur Fleck (Joaquin Phoenix), um homem ignorado pela sociedade, não é apenas um caso de estudo comportamental, mas uma lição de vida.",
                        "Drama, Suspense",
                        R.drawable.tomejerry));
        listaFilmes.add(
                new Filmes("Coringa",
                        "'Coringa' é uma história independente e original. Arthur Fleck (Joaquin Phoenix), um homem ignorado pela sociedade, não é apenas um caso de estudo comportamental, mas uma lição de vida.",
                        "Drama, Suspense",
                        R.drawable.badboys));
        listaFilmes.add(
                new Filmes("Coringa",
                        "'Coringa' é uma história independente e original. Arthur Fleck (Joaquin Phoenix), um homem ignorado pela sociedade, não é apenas um caso de estudo comportamental, mas uma lição de vida.",
                        "Drama, Suspense",
                        R.drawable.bob));
        listaFilmes.add(
                new Filmes("Coringa",
                        "'Coringa' é uma história independente e original. Arthur Fleck (Joaquin Phoenix), um homem ignorado pela sociedade, não é apenas um caso de estudo comportamental, mas uma lição de vida.",
                        "Drama, Suspense",
                        R.drawable.area51));
        listaFilmes.add(
                new Filmes("Coringa",
                        "'Coringa' é uma história independente e original. Arthur Fleck (Joaquin Phoenix), um homem ignorado pela sociedade, não é apenas um caso de estudo comportamental, mas uma lição de vida.",
                        "Drama, Suspense",
                        R.drawable.doom));

        //Criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        // Tipo de layout de a lista irá seguir
        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));
        //Fixador de tamanho da lista - deixar a lista mais rápida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recycler view ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}