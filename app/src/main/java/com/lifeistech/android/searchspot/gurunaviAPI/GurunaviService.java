package com.lifeistech.android.searchspot.gurunaviAPI;

import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.GurunaviData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Masashi Hamaguchi on 2017/03/03.
 */

public interface GurunaviService {
    @GET("/")
    Call<GurunaviData> search(@Query("keyid") String keyId,
                              @Query("format") String format,
                              @Query("freeword") String freeWord);

}
