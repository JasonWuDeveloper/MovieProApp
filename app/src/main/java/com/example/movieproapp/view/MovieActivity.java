package com.example.movieproapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.movieproapp.R;
import com.example.movieproapp.databinding.ActivityMovieBinding;
import com.example.movieproapp.model.Movie;

public class MovieActivity extends AppCompatActivity {
    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        activityMovieBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie);
        Intent i = getIntent();

        if (i != null) {
            movie = i.getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
            getSupportActionBar().setTitle(movie.getTitle());
        }
    }
}