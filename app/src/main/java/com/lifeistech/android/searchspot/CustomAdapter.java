package com.lifeistech.android.searchspot;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.lifeistech.android.searchspot.gurunavi.GurunaviJson;

import java.util.ArrayList;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class CustomAdapter extends ArrayAdapter<GurunaviJson> {

    ArrayList<GurunaviJson> items;

    public CustomAdapter(Context context, int resource, ArrayList<GurunaviJson> objects) {
        super(context, resource, objects);
        items = objects;
    }

}
