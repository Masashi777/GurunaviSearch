package com.lifeistech.android.searchspot.gurunavi;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.http.GET;
import retrofit.http.Query;



/**
 * Created by Masashi Hamaguchi on 2017/02/21.
 */


public class GurunaviRetrofit extends GurunaviConnect {

    private final String keyid = "9ffa01190536dce72adf62e5fba762be";

    public interface GurunaviApiService {
        @GET("/")
        public void serach(@Query("KeyId") String keyid,
                             @Query("freeWord") String freeWord,
                             Callback<GurunaviJson> callback);

    }

    public void serach(final String freehWord, Callback<RestResponse> callback) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(REQUEST_DOMAIN)
                .build();

        GurunaviApiService service = restAdapter.create(GurunaviApiService.class);

        service.serach(keyid, freehWord, new Callback<List<GurunaviJson>>() {
            @Override
            public void success(List<GurunaviJson> grunaviJson, Callback<GurunaviJson> callback) {
                listener.onSuccess(GurunaviJson);
            }

            @Override
            public void failure(RetrofitError error) {
                listener.onFailed(error.toString());
            }

        });

    }
}
