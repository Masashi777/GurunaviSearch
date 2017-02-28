package com.lifeistech.android.searchspot.gurunavi.GurunaviModel;

import com.google.gson.annotations.SerializedName;
import com.lifeistech.android.searchspot.gurunavi.GurunaviModel.Response.ApiVersion;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class Response {
    @SerializedName("@api_version")
    public ApiVersion apiVersion;

    public Response(ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }


    public ApiVersion getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }
}
