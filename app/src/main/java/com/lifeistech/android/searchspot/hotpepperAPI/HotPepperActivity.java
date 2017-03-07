package com.lifeistech.android.searchspot.hotpepperAPI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.lifeistech.android.searchspot.R;
import com.lifeistech.android.searchspot.hotpepperAPI.models.GourmetData;
import com.lifeistech.android.searchspot.hotpepperAPI.models.Shop;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HotPepperActivity extends AppCompatActivity {

    static ListView listView;
    static EditText editText;
    static HotPepperAdapter adapter;
    static NumberPicker numberPicker;

    //コネクタ
    HotPepperConnect connect = new HotPepperRetrofit();

    final HotPepper hotPepper = new HotPepper();

    private static final String key = "858f0a0c573b23a5";
    private static final String format = "json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotpepper);

        listView = (ListView) findViewById(R.id.listView);
        editText = (EditText) findViewById(R.id.editText);
        numberPicker = (NumberPicker) findViewById(R.id.numberPicker);

        numberPicker.setMaxValue(100);
        numberPicker.setMinValue(1);

    }

    public void onClick(View v) {

        hotPepper.getGourmetData(connect, key, editText.getText().toString(), format, String.valueOf(numberPicker.getValue()),new HotPepperConnect.HotPepperSearchListener() {

            @Override
            public void onSuccess(GourmetData gourmetData) {
                //nameだけとりだす
                ArrayList<Shop> shops = new ArrayList<>();

                for (Shop shop : gourmetData.results.getShop()) {
                    shops.add(shop);
                }

                adapter = new HotPepperAdapter(getApplicationContext(), R.layout.rest_list, shops);
                listView.setAdapter(adapter);

            }

            @Override
            public void onFailed(String error) {
                Log.d("TAG", error);
            }
        });

    }
}
