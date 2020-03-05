package com.example.loginpack;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @FormUrlEncoded
    @POST("./")
    Call<ResponseBody> userLogin(
            @Field("email") String email,
            @Field("password") String password
    );
}
