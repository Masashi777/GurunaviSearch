package com.lifeistech.android.searchspot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.lifeistech.android.searchspot.gurunaviAPI.Gurunavi;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviConnect;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.GurunaviResponse;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.Response.apiVersion.Rest;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviRetrofit;

import java.util.ArrayList;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

import static com.lifeistech.android.searchspot.gurunaviAPI.GurunaviConnect.REQUEST_DOMAIN;

public class MainActivity2 extends AppCompatActivity {

    static ListView listView;
    static CustomAdapter adapter;
    static ArrayList<Rest> rests = new ArrayList<Rest>();
    private final String keyId = "9ffa01190536dce72adf62e5fba762be";
    private final String format = "json";

    static EditText editText;

    //コネクタ
    GurunaviConnect connect = new GurunaviRetrofit();

    final Gurunavi gurunavi = new Gurunavi();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        editText = (EditText)findViewById(R.id.editText);

    }

    public void search(View v) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(REQUEST_DOMAIN)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GurunaviRetrofit.GurunaviApiService service = retrofit.create(GurunaviRetrofit.GurunaviApiService.class);

        Call<GurunaviResponse> call = service.search(keyId, format, editText.getText().toString());
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
                //listener.onFailed(t.toString());

            }
        });

//        gurunavi.search(connect, keyId, format, editText.getText().toString(), new GurunaviConnect.GurunaviSearchListener() {
//
//            @Override
//            public void onSuccess(GurunaviResponse gurunaviResponse) {
//                //とりだす
////                ArrayList<Rest> rests = new ArrayList<>();
////
////                for (Rest d : restList) {
////                    rests.add(d);
////                }
////
////                adapter = new CustomAdapter(getApplicationContext(), R.layout.activity_main, rests);
////                listView.setAdapter(adapter);
//
//                Log.d("TAG", "success!!!!!");
//
//            }
//
//            @Override
//            public void onFailed(String error) {
//                Log.e("TAG", error);
//            }
//
//        });


        //listView.setAdapter(adapter);
    }
}
