package com.example.movieapp.Api;

import com.example.movieapp.Model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular?api_key=f59745d8d8795b651776cf8629b9c082")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated?api_key=f59745d8d8795b651776cf8629b9c082")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    //@GET("movie/{movie_id}/videos")
    //Call<TrailerResponse> getMovieTrailer(@Path("movie_id") int id, @Query("api_key") String apiKey);

}
