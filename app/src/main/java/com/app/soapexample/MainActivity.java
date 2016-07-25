package com.app.soapexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RetrofitService retrofit = Api.createRetrofitService();
        retrofit.loginRequest().enqueue(new Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {
                Toast.makeText(MainActivity.this, "ALL OK", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                Log.e("SOAP", t.getMessage());
            }
        });
    }
}
