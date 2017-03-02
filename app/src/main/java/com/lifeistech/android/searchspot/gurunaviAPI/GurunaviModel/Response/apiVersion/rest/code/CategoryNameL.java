package com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.Response.apiVersion.rest.code;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class CategoryNameL {
    @SerializedName("@order")
    public int order;

    public CategoryNameL(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
