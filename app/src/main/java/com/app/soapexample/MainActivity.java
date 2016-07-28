package com.app.soapexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestEnvelope requestEnvelope = new RequestEnvelope();
        requestEnvelope.setBody(new TestModel());
        RetrofitService retrofit = Api.createRetrofitService("http");
        retrofit.testRequest(requestEnvelope).enqueue(new Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {
                ((TextView)findViewById(R.id.response1)).setText(response.body().body.testResponse.value + "");
                Log.d("SOAP", "all ok") ;
            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                Log.d("SOAP", "all bad");
            }
        });
        RetrofitService retrofit2 = Api.createRetrofitService("http");

        RequestEnvelope2 requestEnvelope2 = new RequestEnvelope2();
        requestEnvelope2.setBody(new TestModel());
        retrofit2.testRequest2(requestEnvelope2).enqueue(new Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {
                ((TextView)findViewById(R.id.response2)).setText(response.body().body.testResponse.value + "");
                Log.d("SOAP", "all ok") ;

            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                Log.d("SOAP", "all fail") ;
            }
        });



    }
}
