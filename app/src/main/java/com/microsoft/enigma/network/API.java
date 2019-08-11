package com.microsoft.enigma.network;

import com.microsoft.enigma.models.ElectionModel;
import com.microsoft.enigma.models.RegistrationModel;
import com.microsoft.enigma.models.UserModel;
import com.microsoft.enigma.models.VoteModel;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;
import retrofit2.http.Path;

public interface API {

    @POST("/vote/{electionId}")
    Call<ResponseBody> castVote(@Path("electionId") String electionId, @Body VoteModel requestBody);

    @POST("/voters")
    Call<ResponseBody> createVoter(@Body UserModel requestBody);

    @POST("/api/registerVoter")
    Call<ResponseBody> registerVoter(@Body RegistrationModel requestBody);

    @GET("/voters/{voterId}")
    Call<UserModel> getVoter(@Path("voterId") String voterId);

    @GET("/elections/{electionId}")
    Call<ElectionModel> getElectionById(@Path("electionId") String electionId);

    @GET("/api/elections")
    Call<List<ElectionModel>> getElections();
}
