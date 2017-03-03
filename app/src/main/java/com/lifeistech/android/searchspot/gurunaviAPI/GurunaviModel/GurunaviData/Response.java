package com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData;

import com.google.gson.annotations.SerializedName;

import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.ApiVersion;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.Rest;

import java.util.List;

/**
 * Created by Masashi Hamaguchi on 2017/03/03.
 */

public class Response {
    @SerializedName("@attributes")
    public ApiVersion apiVersion;
    @SerializedName("total_hit_count")
    public int totalHitCount;
    @SerializedName("hit_par_page")
    public int hitParPage;
    @SerializedName("page_offset")
    public int pageOffset;
    public List<Rest> rest;


    public Response(ApiVersion apiVersion, int totalHitCount, int hitParPage, int pageOffset, List<Rest> rest) {
        this.apiVersion = apiVersion;
        this.totalHitCount = totalHitCount;
        this.hitParPage = hitParPage;
        this.pageOffset = pageOffset;
        this.rest = rest;
    }


    public ApiVersion getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    public int getTotalHitCount() {
        return totalHitCount;
    }

    public void setTotalHitCount(int totalHitCount) {
        this.totalHitCount = totalHitCount;
    }

    public int getHitParPage() {
        return hitParPage;
    }

    public void setHitParPage(int hitParPage) {
        this.hitParPage = hitParPage;
    }

    public int getPageOffset() {
        return pageOffset;
    }

    public void setPageOffset(int pageOffset) {
        this.pageOffset = pageOffset;
    }

    public List<Rest> getRest() {
        return rest;
    }

    public void setRest(List<Rest> rest) {
        this.rest = rest;
    }
}
