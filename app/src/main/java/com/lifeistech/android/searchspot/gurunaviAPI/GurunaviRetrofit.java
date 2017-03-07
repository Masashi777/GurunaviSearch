package com.lifeistech.android.searchspot.gurunaviAPI;

import android.util.Log;

import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.GurunaviResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import okhttp3.ResponseBody;
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
        @GET("20150630/")
        Call<ResponseBody> search(@Query("keyid") String keyId,
                                  @Query("format") String format,
                                  @Query("freeword") String freeWord);

    }

    public void search(final String keyId, final  String format, final String freeWord, final GurunaviSearchListener listener) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.gnavi.co.jp/RestSearchAPI/")
                .build();

        GurunaviApiService service = retrofit.create(GurunaviApiService.class);

        Call<ResponseBody> call = service.search(keyId, format, freeWord);

        Log.d("TAG", "RETROFIT" + service.toString());

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Response<ResponseBody> response) {

                // 結果のJsonからString型のresultを作成
                BufferedReader reader = null;
                StringBuilder sb = new StringBuilder();

                    reader = new BufferedReader(
                            new InputStreamReader(response.body().byteStream()));
                    String line;
                    try {
                        while ((line = reader.readLine()) != null) {
                            sb.append(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                String result = sb.toString();

                // 結果のJsonをString型にしてGurunaviSearchListenerのonSuccessに渡す。
                Log.d("TAG", "GurunaviRetrofit_onResponse");
                listener.onSuccess(response.body().toString());

            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("TAG", t.getMessage());
                listener.onFailed(t.toString());

            }
        });

    }
}

