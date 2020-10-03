package com.vnrvjiet.TechAssist.util;

import com.vnrvjiet.TechAssist.Model.NewsResource;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiResponse {

    @GET("top-headlines")
    Call<NewsResource> getTopHeadlines(@Query("country") String country,
                                       @Query("apiKey") String apiKey);

    @GET("top-headlines")
    Call<NewsResource> getWorldHeadlines(@Query("sources") String sources,
                                         @Query("apiKey") String apiKey);

    @GET("top-headlines")
    Call<NewsResource> getCategoryOfHeadlines(@Query("country") String country,
                                              @Query("category") String category,
                                              @Query("apiKey") String apiKey);
}
