package com.example.appelreseau;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListRepoActivity extends AppCompatActivity {
    public RepoItem repo = new RepoItem();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        RecyclerView recyclerView = findViewById(R.id.repos);
        if(getIntent().getExtras() != null) {
            repo = (RepoItem) getIntent().getSerializableExtra("repo");
            System.out.println("la repo est "+repo);
        }

        Adapter repoAdapter = new Adapter (repo.getRepos());
        recyclerView.setAdapter(repoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
