package com.example.movieproapp.service;

import com.example.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {
  //Base Url
    //https://api.themoviedb.org/3/
    //
    //End Point URL
    //movie/popular?api_key=b77890f4d344168d34cdf73e4a68572d&language=en-US&page=1
    @GET("movie/popular")
    Call<Result> getPopularMovie(@Query("api_key") String apiKey
    );
}
