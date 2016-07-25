package com.app.soapexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface RetrofitService {
    @Headers({
            "Content-Type: application/soap+xml",
            "Accept-Charset: utf-8",
            "Authorization: Basic dGVzdDp0ZXN0"
    })
    @GET("ws/get?wsdl")
    Call<ResponseEnvelope> loginRequest();
}
