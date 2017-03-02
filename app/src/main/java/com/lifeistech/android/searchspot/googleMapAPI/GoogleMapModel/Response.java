package com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel;

import java.util.List;

/**
 * Created by Masashi Hamaguchi on 2017/03/02.
 */

public class Response {
    private static final String TAG = Response.class.getSimpleName();
    private final Response self = this;

    private List<Result> results;


    public Response(List<Result> results) {
        this.results = results;
    }


    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
