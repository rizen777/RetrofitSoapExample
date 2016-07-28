package com.app.soapexample;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitService {
    @Headers({
            "Content-Type: application/soap+xml",
            "Accept-Charset: utf-8",
            "Authorization:"
    })
    @POST("ws/registeration")
    Call<ResponseEnvelope> testRequest2(@Body RequestEnvelope2 request);

    @POST("ws/test")
    Call<ResponseEnvelope> testRequest(@Body RequestEnvelope requestEnvelope);
}
