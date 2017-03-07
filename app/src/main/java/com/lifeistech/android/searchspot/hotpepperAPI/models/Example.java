
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("getGourmetData")
    @Expose
    private Results results;

    /**
     * 
     * @return
     *     The getGourmetData
     */
    public Results getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The getGourmetData
     */
    public void setResults(Results results) {
        this.results = results;
    }

}
