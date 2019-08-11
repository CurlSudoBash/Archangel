package com.microsoft.enigma.network;

import android.util.Log;

import com.microsoft.enigma.models.ElectionModel;
import com.microsoft.enigma.models.RegistrationModel;
import com.microsoft.enigma.models.UserModel;
import com.microsoft.enigma.models.VoteModel;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ApiClient {

    private final static String baseURL = "https://limelite.cf/";
    private final static Retrofit retrofit = new Retrofit.Builder().baseUrl(baseURL).build();
    private final static API api = retrofit.create(API.class);

    public static void castVote(String electionId, String candidate, String epicNumber) {
        api.castVote(electionId, new VoteModel(candidate, epicNumber)).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    if(response.body() == null) return;
                    String res = response.body().string();
                    Log.d("VoteStatus", res);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {}
        });
    }

    public static void createVoter(UserModel voter) {
        api.createVoter(voter).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    if(response.body() == null) return;
                    String res = response.body().string();
                    Log.d("VoterCreationStatus", res);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {}
        });
    }

    public static void registerVoter(String electionId, String epicNumber, String constituency) {
        api.registerVoter(new RegistrationModel(electionId, epicNumber, constituency)).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    if (response.body() == null) return;
                    String res = response.body().string();
                    Log.d("VoterRegistrationStatus", res);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {}
        });
    }

    public static UserModel getVoter(String epicNumber) {
        UserModel user = null;
        try {
            user = api.getVoter(epicNumber).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

    public static ElectionModel getElectionById(String electionId) {
        ElectionModel election = null;
        try {
            election = api.getElectionById(electionId).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return election;
    }

    public static List<ElectionModel> getElections() {
        List<ElectionModel> elections = null;
        try {
            elections = api.getElections().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return elections;
    }
}
