
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pc {

    @SerializedName("l")
    @Expose
    private String l;
    @SerializedName("m")
    @Expose
    private String m;
    @SerializedName("s")
    @Expose
    private String s;

    /**
     * 
     * @return
     *     The l
     */
    public String getL() {
        return l;
    }

    /**
     * 
     * @param l
     *     The l
     */
    public void setL(String l) {
        this.l = l;
    }

    /**
     * 
     * @return
     *     The m
     */
    public String getM() {
        return m;
    }

    /**
     * 
     * @param m
     *     The m
     */
    public void setM(String m) {
        this.m = m;
    }

    /**
     * 
     * @return
     *     The s
     */
    public String getS() {
        return s;
    }

    /**
     * 
     * @param s
     *     The s
     */
    public void setS(String s) {
        this.s = s;
    }

}
