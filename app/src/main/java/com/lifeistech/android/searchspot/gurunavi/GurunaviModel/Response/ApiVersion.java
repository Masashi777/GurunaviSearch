package com.lifeistech.android.searchspot.gurunavi.GurunaviModel.Response;

import com.google.gson.annotations.SerializedName;
import com.lifeistech.android.searchspot.gurunavi.GurunaviModel.Response.apiVersion.Rest;

import java.util.List;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class ApiVersion {
    @SerializedName("total_hit_count")
    public int totalHitCount;
    @SerializedName("hit_per_page")
    public int hitPerPage;
    @SerializedName("page_offset")
    public int pageOffset;
    public List<Rest> restList;


    public ApiVersion(int totalHitCount, int hitPerPage, int pageOffset, List<Rest> restList) {
        this.totalHitCount = totalHitCount;
        this.hitPerPage = hitPerPage;
        this.pageOffset = pageOffset;
        this.restList = restList;
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

    public void setPageOffset(int pageOffset) {
        this.pageOffset = pageOffset;
    }

    public List<Rest> getRestList() {
        return restList;
    }

    public void setRestList(List<Rest> restList) {
        this.restList = restList;
    }
}
