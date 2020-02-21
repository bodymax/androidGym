package com.example.trynfc;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CommutedInterface {
    String COMMUTED = "http://gym.etouchsol.net/api/";

    @GET("committed")
    Call<List<Commuted>> getCommuted();

    @FormUrlEncoded
    @POST("committed")
    Call<String> postCommited(
            @Field("card_code") String card_code,
            @Field("sport_id") String sport_id
    );


    @GET("committedSport")
    Call<List<Sport>> getSPorts();
}
