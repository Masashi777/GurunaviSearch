package com.lifeistech.android.searchspot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.lifeistech.android.searchspot.gurunavi.Gurunavi;
import com.lifeistech.android.searchspot.gurunavi.GurunaviConnect;
import com.lifeistech.android.searchspot.gurunavi.GurunaviModel.GurunaviResponse;
import com.lifeistech.android.searchspot.gurunavi.GurunaviModel.Response.apiVersion.Rest;
import com.lifeistech.android.searchspot.gurunavi.GurunaviRetrofit;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    static ListView listView;
    static CustomAdapter adapter;
    static ArrayList<Rest> rests = new ArrayList<Rest>();
    private final String keyId = "9ffa01190536dce72adf62e5fba762be";
    private final String format = "json";
    private final String freeword = "喫茶";

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

        gurunavi.search(connect, keyId, format, freeword, new GurunaviConnect.GurunaviSearchListener() {

            @Override
            public void onSuccess(String result) {


                //json中の{}を""に変換
                String regex = "\\{\\}";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(result);
                String json = m.replaceAll("\"\"");



                // String(中身はjson形式)から GurunaviResponse型への変換
                Gson gson = new Gson();
                GurunaviResponse gurunaviResponse1 = gson.fromJson(json, GurunaviResponse.class);

                Log.d("TAG", gurunaviResponse1.getRestList().get(0).getAddress());
                Log.d("TAG", "success!!!!!");


//                //とりだす
//                ArrayList<Rest> rests = new ArrayList<>();
//
//                for (Rest d : restList) {
//                    rests.add(d);
//                }
//
//                adapter = new CustomAdapter(getApplicationContext(), R.layout.activity_main, rests);
//                listView.setAdapter(adapter);

            }

            @Override
            public void onFailed(String error) {
                Log.e("TAG", error);
            }

        });


        //listView.setAdapter(adapter);
    }
}
