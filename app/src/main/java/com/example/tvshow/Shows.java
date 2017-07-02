package com.example.tvshow;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by himanshu on 01-07-2017.
 */

public class Shows {


    @SerializedName("original_name")
    String original_name;

    @SerializedName("name")
    String name;

    @SerializedName("poster_path")
    String posterpath;

    @SerializedName("first_air_date")
    String first_air_date;

    @SerializedName("origin_country")
    String country;

    @SerializedName("overview")
    String overview;
    @SerializedName("release_date")
    String releasedate;
    @SerializedName("genre_ids")
    ArrayList<Integer> genreIds= new ArrayList<>();
    @SerializedName("id")
    Integer id;
    @SerializedName("original_title")
    String original_title;
    @SerializedName("original_language")
    String original_language;
    @SerializedName("title")
    String title;
    @SerializedName("backdrop_path")
    String backdrop_path;
    @SerializedName("popularity")
    Double popularity;
    @SerializedName("vote_count")
    Integer vote_count;
    @SerializedName("video")
    Boolean video;
    @SerializedName("vote_average")
    Double vote_average;
    @SerializedName("tagline")
    String tagline;


    public Shows(String posterpath, String original_name, String name, String first_air_date, String country, String overview, String releaseDate, ArrayList<Integer> genreIds, Integer id,
                 String original_Title, String original_language, String title, String backdrop_Path, Double popularity,
                 Integer vote_count, Boolean video, Double vote_average, String tagline) {

        this.posterpath= posterpath;
        this.original_name=original_name;
        this.name= name;
        this.first_air_date=first_air_date;
        this.country= country;
        this.overview= overview;
        this.releasedate=releaseDate;
        this.genreIds=genreIds;
        this.id= id;
        this.original_title= original_Title;
        this.original_language= original_language;
        this.title= title;
        this.backdrop_path= backdrop_Path;
        this.popularity= popularity;
        this.vote_count= vote_count;
        this.video= video;
        this.vote_average= vote_average;
        this.tagline=tagline;

    }

    public String getPosterPath() {
        return posterpath;
    }

    public String getTagline()
    {
        return tagline;
    }

    public void setPosterPath(String posterPath) {
        this.posterpath = posterPath;
    }

    public String getOriginal_name() {

        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name=original_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releasedate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releasedate = releaseDate;
    }

    public ArrayList<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(ArrayList<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalTitle() {
        return original_title;
    }

    public void setOriginalTitle(String originalTitle) {
        this.original_title = originalTitle;
    }

    public String getOriginalLanguage() {
        return original_language;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.original_language = originalLanguage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackdropPath() {
        return backdrop_path;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdrop_path = backdropPath;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Integer getVoteCount() {
        return vote_count;
    }

    public void setVoteCount(Integer voteCount) {
        this.vote_count = voteCount;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Double getVoteAverage() {
        return vote_average;
    }

    public void setVoteAverage(Double voteAverage) {
        this.vote_average = voteAverage;
    }





}
