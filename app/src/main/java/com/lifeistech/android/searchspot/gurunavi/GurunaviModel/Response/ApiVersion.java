package com.lifeistech.android.searchspot.gurunavi.GurunaviModel.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class ApiVersion {
    @SerializedName("api_version")
    public String apiversion;

    public ApiVersion(String apiversion) {
        this.apiversion = apiversion;
    }

    public String getApiversion() {
        return apiversion;
    }

    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }
}
