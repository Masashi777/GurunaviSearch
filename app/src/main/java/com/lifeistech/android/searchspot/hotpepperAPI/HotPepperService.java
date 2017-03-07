package com.lifeistech.android.searchspot.hotpepperAPI;

import com.lifeistech.android.searchspot.hotpepperAPI.models.GourmetData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by k-seito on 2016/01/28.
 */
public interface HotPepperService {
    @GET("/hotpepper/gourmet/v1/")
    Call<GourmetData> getGourmetData(@Query("key") String key, @Query("keyword") String keyword, @Query("format") String format);
}
