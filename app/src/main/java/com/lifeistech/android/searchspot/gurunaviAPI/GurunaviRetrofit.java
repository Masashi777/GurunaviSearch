package com.lifeistech.android.searchspot.gurunaviAPI;

import android.util.Log;

import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.GurunaviResponse;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.Response.apiVersion.Rest;
import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;
import java.util.List;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;



/**
 * Created by Masashi Hamaguchi on 2017/02/21.
 */


public class GurunaviRetrofit extends GurunaviConnect {

    List<Rest> restList;

    public interface GurunaviApiService {
        @GET("/")
        Call<GurunaviResponse> search(@Query("keyid") String keyId,
                                      @Query("format") String format,
                                      @Query("freeword") String freeWord);

    }

    public void search(final String keyId, final  String format, final String freeWord, final GurunaviSearchListener listener) {

//        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//        OkHttpClient okHttpclient = new OkHttpClient.Builder()
//                .addInterceptor(loggingInterceptor)
//                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(REQUEST_DOMAIN)
//                .client(okHttpclient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GurunaviApiService service = retrofit.create(GurunaviApiService.class);

        Call<GurunaviResponse> call = service.search(keyId, format, freeWord);
        Log.d("TAG", "RETROFIT");
        call.enqueue(new Callback<GurunaviResponse>() {
            @Override
            public void onResponse(Response<GurunaviResponse> response, Retrofit retrofit) {
                Log.d("TAG", "GurunaviRetrofit_Response");
                //listener.onSuccess(gurunaviResponse);
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("TAG", "GurunaviRetrofit.Error");
                listener.onFailed(t.toString());

            }
        });

    }
}

