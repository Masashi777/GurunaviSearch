
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("mobile")
    @Expose
    private Mobile mobile;
    @SerializedName("pc")
    @Expose
    private Pc pc;

    /**
     * 
     * @return
     *     The mobile
     */
    public Mobile getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    /**
     * 
     * @return
     *     The pc
     */
    public Pc getPc() {
        return pc;
    }

    /**
     * 
     * @param pc
     *     The pc
     */
    public void setPc(Pc pc) {
        this.pc = pc;
    }

}
