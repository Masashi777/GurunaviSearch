package com.lifeistech.android.searchspot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.lifeistech.android.searchspot.gurunaviAPI.Gurunavi;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviConnect;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.GurunaviData;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.Rest;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviRetrofit;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ListView listView;
    static CustomAdapter adapter;
    //static ArrayList<Rest> rests = new ArrayList<Rest>();
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

        gurunavi.search(connect, keyId, format, editText.getText().toString(), new GurunaviConnect.GurunaviSearchListener() {

            @Override
            public void onSuccess(GurunaviData gurunaviData) {
                //とりだす
                ArrayList<Rest> rests = new ArrayList<>();

                for (Rest r: gurunaviData.getResponse().getRest()) {
                    rests.add(r);
                }

                adapter = new CustomAdapter(getApplicationContext(), R.layout.activity_main, rests);
                listView.setAdapter(adapter);

                Log.d("TAG", "success!!!!!");

            }

            @Override
            public void onFailed(String error) {
                Log.e("TAG", error);
            }

        });

    }
}
