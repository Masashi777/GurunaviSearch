
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Budget {

    @SerializedName("average")
    @Expose
    private String average;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;

    /**
     * 
     * @return
     *     The average
     */
    public String getAverage() {
        return average;
    }

    /**
     * 
     * @param average
     *     The average
     */
    public void setAverage(String average) {
        this.average = average;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

}
