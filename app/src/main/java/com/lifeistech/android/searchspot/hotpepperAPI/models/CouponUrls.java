
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CouponUrls {

    @SerializedName("sp")
    @Expose
    private String sp;
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
     *     The sp
     */
    public String getSp() {
        return sp;
    }

    /**
     * 
     * @param sp
     *     The sp
     */
    public void setSp(String sp) {
        this.sp = sp;
    }

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
