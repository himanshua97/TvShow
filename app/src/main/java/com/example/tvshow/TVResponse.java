package com.example.tvshow;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by himanshu on 01-07-2017.
 */

public class TVResponse {


    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Shows> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;


    public ArrayList<Shows> getResults() {
        return (ArrayList<Shows>) results;
    }
    public void setResults(List<Shows> results) {
        this.results = results;
    }

}

