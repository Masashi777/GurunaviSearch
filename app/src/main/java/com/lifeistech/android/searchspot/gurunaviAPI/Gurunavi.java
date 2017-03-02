package com.lifeistech.android.searchspot.gurunaviAPI;

import android.util.Log;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class Gurunavi {

    public Gurunavi() {

    }

    public void search(GurunaviConnect connect, String keyId, String format, String freeWord, final GurunaviConnect.GurunaviSearchListener listener) {
        Log.d("TAG", "Gurunavi.search");
        connect.search(keyId, format, freeWord, listener);
    }


}
