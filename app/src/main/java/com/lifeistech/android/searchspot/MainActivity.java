package com.lifeistech.android.searchspot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.lifeistech.android.searchspot.gurunavi.GurunaviConnect;
import com.lifeistech.android.searchspot.gurunavi.GurunaviRetrofit;

import retrofit.RetrofitError;
import retrofit.converter.GsonConverter;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText editText;

    //コネクタ
    GurunaviConnect connect = new GurunaviRetrofit();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        editText = (EditText)findViewById(R.id.editText);

    }

    public void serach(View v) {
        CustomAdapter adapter = new CustomAdapter().Builder()
                .baseUrl(GurunaviRetrofit.REQUEST_DOMAIN)
                //.addConverterFactory(GsonConverterFactory.creat())
                .build();


        listView.setAdapter(adapter);
    }
}
