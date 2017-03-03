
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Results {

    @SerializedName("results_start")
    @Expose
    private Integer resultsStart;
    @SerializedName("results_returned")
    @Expose
    private String resultsReturned;
    @SerializedName("api_version")
    @Expose
    private String apiVersion;
    @SerializedName("shop")
    @Expose
    private List<Shop> shop = new ArrayList<Shop>();
    @SerializedName("results_available")
    @Expose
    private Integer resultsAvailable;

    /**
     * 
     * @return
     *     The resultsStart
     */
    public Integer getResultsStart() {
        return resultsStart;
    }

    /**
     * 
     * @param resultsStart
     *     The results_start
     */
    public void setResultsStart(Integer resultsStart) {
        this.resultsStart = resultsStart;
    }

    /**
     * 
     * @return
     *     The resultsReturned
     */
    public String getResultsReturned() {
        return resultsReturned;
    }

    /**
     * 
     * @param resultsReturned
     *     The results_returned
     */
    public void setResultsReturned(String resultsReturned) {
        this.resultsReturned = resultsReturned;
    }

    /**
     * 
     * @return
     *     The apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * @param apiVersion
     *     The api_version
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * @return
     *     The shop
     */
    public List<Shop> getShop() {
        return shop;
    }

    /**
     * 
     * @param shop
     *     The shop
     */
    public void setShop(List<Shop> shop) {
        this.shop = shop;
    }

    /**
     * 
     * @return
     *     The resultsAvailable
     */
    public Integer getResultsAvailable() {
        return resultsAvailable;
    }

    /**
     * 
     * @param resultsAvailable
     *     The results_available
     */
    public void setResultsAvailable(Integer resultsAvailable) {
        this.resultsAvailable = resultsAvailable;
    }

}
