package com.lifeistech.android.searchspot.googleMapAPI;

import com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel.Response;

import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Created by Masashi Hamaguchi on 2017/03/02.
 */

public interface PlaceApiService {
    @Headers("Accept-Language: ja")
    @GET("/maps/api/place/search/json")
    Call<Response> requestPlaces(@Query("types") String types,
                                 @Query("location") String location,
                                 @Query("radius") String radius,
                                 @Query("sensor") String sensor,
                                 @Query("key") String key);

}
