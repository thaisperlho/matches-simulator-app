package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.data.MatchesApi;
import me.dio.simulator.databinding.ActivityMainBinding;
import me.dio.simulator.domain.Team;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MatchesApi matchesApi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://thaisperlho.github.io/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesApi = retrofit.create(MatchesApi.class);
    }

    private void setupMatchesList() {
        //TODO Listar as partidas consumindo nossa API.
    }

    private void setupMatchesRefresh() {
        //TODO Atualizar as partidas na ação de swipe.
    }

    private void setupFloatingActionButton() {
        //TODO Criar evento de click de simalação de partidas.
    }
}
