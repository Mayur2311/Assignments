package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignment1.adapter.MovieAdapter;
import com.example.assignment1.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Movie> movie;

    public ArrayList<Movie> getMovie(){
        ArrayList<Movie> movie = new ArrayList<>();
        movie.add(0,"Race");
        
        return movie;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.mainActivity);
        movie = getMovie();
        MovieAdapter adapter = new MovieAdapter(movie);
        listView.setAdapter(adapter);
    }
}
