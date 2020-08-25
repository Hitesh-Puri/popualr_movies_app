package com.example.popularmovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TMDbAPI {
    @GET("movies/popular")
    Call<MovieNetworkResponse> getPopularMovies(@Query("api_key") String apikey);

    @GET("movie/top_rated")
    Call<MovieNetworkResponse> getTopRatedMovies(@Query("api_key")String apikey);
}
