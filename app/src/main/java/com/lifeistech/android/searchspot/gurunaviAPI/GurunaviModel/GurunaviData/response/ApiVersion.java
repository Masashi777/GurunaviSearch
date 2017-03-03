package com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class ApiVersion {
    @SerializedName("api_version")
    public int apiVersion;


    public ApiVersion(int apiVersion) {
        this.apiVersion = apiVersion;
    }


    public int getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(int apiVersion) {
        this.apiVersion = apiVersion;
    }
}
