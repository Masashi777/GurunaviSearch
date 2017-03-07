package com.lifeistech.android.searchspot.hotpepperAPI;

import android.util.Log;

import com.lifeistech.android.searchspot.hotpepperAPI.models.GourmetData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Masashi Hamaguchi on 2017/03/03.
 */

public class HotPepperRetrofit extends HotPepperConnect {


    public interface HotPepperApiService {
        @GET("/hotpepper/gourmet/v1/")
        Call<GourmetData> getGourmetData(@Query("key") String key,
                                         @Query("keyword") String keyword,
                                         @Query("format") String format,
                                         @Query("count") String count);

    }

    public void getGourmetData(final String key, final  String keyword, final String format, final String count, final HotPepperSearchListener listener) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOTPEPPER_DOMAIN)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        HotPepperApiService service = retrofit.create(HotPepperApiService.class);

        Call<GourmetData> call = service.getGourmetData(key, keyword, format, count);
        call.enqueue(new Callback<GourmetData>() {
            @Override
            public void onResponse(Response<GourmetData> response) {
                Log.d("TAG", "HotPepperRetrofit_onResponse");
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
