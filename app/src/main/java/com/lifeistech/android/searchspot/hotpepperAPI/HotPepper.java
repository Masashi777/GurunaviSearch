package com.lifeistech.android.searchspot.hotpepperAPI;

/**
 * Created by Masashi Hamaguchi on 2017/03/03.
 */

public class HotPepper {

    public HotPepper() {

    }

    public void getGourmetData(HotPepperConnect connect, String key, String keyword, String format, String count, final HotPepperConnect.HotPepperSearchListener listener) {
        connect.getGourmetData(key, keyword, format, count, listener);
    }
}
