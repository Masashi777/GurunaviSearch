package com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel;

import com.google.gson.annotations.SerializedName;

import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.Response;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class GurunaviData {
    @SerializedName("Response")
    public Response response;


    public GurunaviData(Response response) {
        this.response = response;
    }


    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
