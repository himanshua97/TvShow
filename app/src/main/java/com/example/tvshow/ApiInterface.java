package com.example.tvshow;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by himanshu on 15-04-2017.
 */

public interface ApiInterface {

    @GET("tv/popular")
    Call<TVResponse> getPopularShows(@Query("api_key") String apiKey);


}
