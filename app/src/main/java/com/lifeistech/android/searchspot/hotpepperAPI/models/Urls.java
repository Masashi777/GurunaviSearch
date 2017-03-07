
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls {

    @SerializedName("qr")
    @Expose
    private String qr;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("pc")
    @Expose
    private String pc;

    /**
     * 
     * @return
     *     The qr
     */
    public String getQr() {
        return qr;
    }

    /**
     * 
     * @param qr
     *     The qr
     */
    public void setQr(String qr) {
        this.qr = qr;
    }

    /**
     * 
     * @return
     *     The mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 
     * @return
     *     The pc
     */
    public String getPc() {
        return pc;
    }

    /**
     * 
     * @param pc
     *     The pc
     */
    public void setPc(String pc) {
        this.pc = pc;
    }

}