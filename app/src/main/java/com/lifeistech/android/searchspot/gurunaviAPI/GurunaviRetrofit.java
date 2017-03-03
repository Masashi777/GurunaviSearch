package com.lifeistech.android.searchspot.gurunaviAPI;

import android.util.Log;

import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.GurunaviData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;



/**
 * Created by Masashi Hamaguchi on 2017/02/21.
 */


public class GurunaviRetrofit extends GurunaviConnect {

    public interface GurunaviApiService {
        @GET("/")
        Call<GurunaviData> search(@Query("keyid") String keyId,
                                  @Query("format") String format,
                                  @Query("freeword") String freeWord);

    }

    public void search(final String keyId, final  String format, final String freeWord, final GurunaviSearchListener listener) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.gnavi.co.jp/RestSearchAPI/20150630")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GurunaviApiService service = retrofit.create(GurunaviApiService.class);

        Call<GurunaviData> call = service.search(keyId, format, freeWord);

        Log.d("TAG", "RETROFIT" + service.toString());

        call.enqueue(new Callback<GurunaviData>() {
            @Override
            public void onResponse(Response<GurunaviData> response) {
                Log.d("TAG", "GurunaviRetrofit_onResponse");
                listener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("TAG", t.getMessage());
                listener.onFailed(t.toString());

            }
        });

    }
}

