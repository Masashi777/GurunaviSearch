package com.lifeistech.android.searchspot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel.Location;
import com.lifeistech.android.searchspot.googleMapAPI.PlacesApiHelper;
import com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel.Response;
import com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel.Result;

import java.util.List;

import retrofit.Callback;
import retrofit.Retrofit;

/**
 * Created by Masashi Hamaguchi on 2017/03/02.
 */

public class Map extends AppCompatActivity implements OnMapReadyCallback {
    private static final String TAG = PasteActivity.class.getSimpleName();
    private final PasteActivity self = this;

    EditText mSearchEdit;
    Button mSearchButton;

    PlacesApiHelper mHelper;

    private GoogleMap mGoogleMap;
    private SupportMapFragment mMapFragment;
    private LatLng mCurrentLatLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchEdit = (EditText) findViewById(R.id.edit_search_word);
        mSearchButton = (Button) findViewById(R.id.btn_search);
        mSearchButton.setOnClickListener(mOnSearchButtonClickListener);

        mHelper = new PlacesApiHelper(this);

        mMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
    }

    private View.OnClickListener mOnSearchButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mCurrentLatLng = new LatLng(34.694487, 135.19517);
            // Places APIへリクエスト．5000は現在位置からの半径（m）
            mHelper.requestPlaces("food", mCurrentLatLng, 5000, mResultCallback);
        }
    };

    // レスポンスの処理
    private Callback<Response> mResultCallback = new Callback<Response>() {
        @Override
        public void onResponse(retrofit.Response<Response> response, Retrofit retrofit) {
            mGoogleMap.clear();
            // レスポンスからResultのリストを取得
            List<Result> results = response.body().getResults();
            // Resultの数だけピンを立てる
            for(Result r : results) {
                Location location = r.getGeometry().getLocation();
                LatLng latLng = new LatLng(location.getLat(), location.getLng());
                String name = r.getName();
                mGoogleMap.addMarker(new MarkerOptions().position(latLng).title(name));
            }
            mGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mCurrentLatLng, 15));
        }

        @Override
        public void onFailure(Throwable t) {
            t.printStackTrace();
        }
    };


}
