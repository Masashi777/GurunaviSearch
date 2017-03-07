package com.lifeistech.android.searchspot.gurunaviAPI;

<<<<<<< HEAD:app/src/main/java/com/lifeistech/android/searchspot/gurunavi/Gurunavi.java
=======
import android.util.Log;

>>>>>>> second_copy:app/src/main/java/com/lifeistech/android/searchspot/gurunaviAPI/Gurunavi.java
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
