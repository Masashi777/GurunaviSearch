package com.lifeistech.android.searchspot.gurunaviAPI;

import android.util.Log;

import com.lifeistech.android.searchspot.googleMapAPI.GoogleMapModel.Response;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.GurunaviResponse;
import com.lifeistech.android.searchspot.gurunaviAPI.GurunaviModel.Response.apiVersion.Rest;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Masashi Hamaguchi on 2017/02/21.
 */

public abstract class GurunaviConnect implements Serializable {

    public static final String REQUEST_DOMAIN = "https://api.gnavi.co.jp/RestSearchAPI/20150630";


    public interface GurunaviSearchListener {

        public void onSuccess(GurunaviResponse gurunaviResponse);

        public void onFailed(String error);

    }

    public abstract void search(final String keyId, final String format, final String freeWord, final GurunaviSearchListener listener);


}
