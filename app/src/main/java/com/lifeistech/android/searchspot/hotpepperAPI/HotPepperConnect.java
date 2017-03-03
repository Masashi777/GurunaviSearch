package com.lifeistech.android.searchspot.hotpepperAPI;

import com.lifeistech.android.searchspot.hotpepperAPI.models.GourmetData;

import java.io.Serializable;

/**
 * Created by Masashi Hamaguchi on 2017/03/03.
 */

public abstract class HotPepperConnect implements Serializable {

    public static final String HOTPEPPER_DOMAIN = "http://webservice.recruit.co.jp";

    public interface HotPepperSearchListener {

        public void onSuccess(GourmetData gourmetData);

        public void onFailed(String error);

    }

    public abstract void getGourmetData(final String key, final String keyword, final String format, final String count, final HotPepperSearchListener listener);

}
