package com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel;

import com.google.gson.annotations.SerializedName;
<<<<<<< HEAD:app/src/main/java/com/lifeistech/android/searchspot/gurunavi/GurunaviModel/Response/ApiVersion.java
=======
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.Response.ApiVersion;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.Response.apiVersion.Rest;

import java.util.List;
>>>>>>> second_copy:app/src/main/java/com/lifeistech/android/searchspot/gurunaviAPI/GurunaviModel/GurunaviResponse.java

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

<<<<<<< HEAD:app/src/main/java/com/lifeistech/android/searchspot/gurunavi/GurunaviModel/Response/ApiVersion.java
public class ApiVersion {
    @SerializedName("api_version")
    public String apiversion;
=======
public class GurunaviResponse {


    @SerializedName("@attributes")
    public ApiVersion attributes;
    @SerializedName("total_hit_count")
    public int totalHitCount;
    @SerializedName("hit_per_page")
    public int hitPerPage;
    @SerializedName("page_offset")
    public int pageOffset;
    @SerializedName("rest")
    public List<Rest> restList;


    public GurunaviResponse(ApiVersion attributes, int totalHitCount, int hitPerPage, int pageOffset, List<Rest> restList) {

        this.attributes = attributes;
        this.totalHitCount = totalHitCount;
        this.hitPerPage = hitPerPage;
        this.pageOffset = pageOffset;
        this.restList = restList;
    }

    public ApiVersion getAttributes() {
        return attributes;
    }

    public void setAttributes(ApiVersion attributes) {
        this.attributes = attributes;
    }

    public int getTotalHitCount() {
        return totalHitCount;
    }

    public void setTotalHitCount(int totalHitCount) {
        this.totalHitCount = totalHitCount;
    }

    public int getHitPerPage() {
        return hitPerPage;
    }

    public void setHitPerPage(int hitPerPage) {
        this.hitPerPage = hitPerPage;
    }

    public int getPageOffset() {
        return pageOffset;
    }
>>>>>>> second_copy:app/src/main/java/com/lifeistech/android/searchspot/gurunaviAPI/GurunaviModel/GurunaviResponse.java

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
