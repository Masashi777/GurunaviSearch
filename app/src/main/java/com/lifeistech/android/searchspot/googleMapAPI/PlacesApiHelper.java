//package com.lifeistech.android.searchspot.googleMapAPI;
//
//import android.content.Context;
//
//import com.google.android.gms.maps.model.LatLng;
//import com.lifeistech.android.searchspot.R;
//import com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel.GurunaviData;
//
//import retrofit.Call;
//import retrofit.Callback;
//import retrofit.GsonConverterFactory;
//import retrofit.Retrofit;
//
///**
// * Created by Masashi Hamaguchi on 2017/03/02.
// */
//
//public class PlacesApiHelper {
//    private static final String TAG = PlacesApiHelper.class.getSimpleName();
//    private final PlacesApiHelper self = this;
//
//    private static final String key = "";
//
//    private Context mContext;
//
//    public void PlacesApiHelper(Context context) {
//        mContext = context;
//    }
//
//    public void requestPlaces(String types, LatLng latLng, Callback<GurunaviData> callback) {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(mContext.getString(R.string.places_api_url))
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        PlaceApiService service = retrofit.create(PlaceApiService.class);
//
//        Call<GurunaviData> call = service.requestPlaces(types,
//                String.valueOf(latLng.latitude) + "," + String.valueOf(latLng.longitude), key);
//        call.enqueue(callback);
//    }
//
//}
