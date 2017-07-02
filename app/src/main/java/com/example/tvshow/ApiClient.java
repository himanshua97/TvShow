package com.example.tvshow;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by himanshu on 15-04-2017.
 */

public class ApiClient {

    static ApiInterface apiInterface;

    public static ApiInterface getApiInterface() {

        if(apiInterface==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.themoviedb.org/3/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiInterface= retrofit.create(ApiInterface.class);
        }


        return apiInterface;
    }
}
