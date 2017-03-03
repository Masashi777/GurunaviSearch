package com.lifeistech.android.searchspot.googleMapAPI;

import com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel.Response;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Masashi Hamaguchi on 2017/03/02.
 */

public class GoogleMapRetrofit extends GoogleMapConnect {

    public interface PlaceApiService {
        @Headers("Accept-Language: ja")
        @GET("/maps/api/place/search/json")
        Call<Response> requestPlaces(@Query("types") String types,
                                     @Query("location") String location,
                                     @Query("radius") String radius,
                                     @Query("sensor") String sensor,
                                     @Query("key") String key);
    }
}
