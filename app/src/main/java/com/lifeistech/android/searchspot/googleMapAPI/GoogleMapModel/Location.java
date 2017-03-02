package com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel;

/**
 * Created by Masashi Hamaguchi on 2017/03/02.
 */

public class Location {
    private static final String TAG = Location.class.getSimpleName();
    private final Location self = this;

    private double lat;
    private double lng;


    public Location(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

}
