package com.lifeistech.android.searchspot.gurunavi;

import com.lifeistech.android.searchspot.gurunavi.GurunaviModel.GurunaviResponse;
import com.lifeistech.android.searchspot.gurunavi.GurunaviModel.Response.apiVersion.Rest;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;



/**
 * Created by Masashi Hamaguchi on 2017/02/21.
 */


public class GurunaviRetrofit extends GurunaviConnect {

    public interface GurunaviApiService {
        @GET("/")
        public void search(@Query("keyid") String keyId,
                           @Query("format") String format,
                           @Query("freeword") String freeWord,
                           Callback<GurunaviResponse> callback);

    }

    public void search(final String keyId, final  String format, final String freeWord, final GurunaviSearchListener listener) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(REQUEST_DOMAIN)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        GurunaviApiService service = restAdapter.create(GurunaviApiService.class);

        service.search(keyId, format, freeWord, new Callback<GurunaviResponse>() {
            @Override
            public void success(GurunaviResponse gurunaviResponse, Response response) {
                //listener.onSuccess(restList);
            }

            @Override
            public void failure(RetrofitError error) {
                listener.onFailed(error.toString());
            }

        });

    }
}

