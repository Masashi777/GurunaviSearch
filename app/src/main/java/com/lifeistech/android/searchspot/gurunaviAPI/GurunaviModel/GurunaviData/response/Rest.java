package com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response;

import com.google.gson.annotations.SerializedName;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.rest.Access;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.rest.Code;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.rest.CouponURL;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.rest.Flags;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.rest.ImageURL;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.rest.Order;
import com.lifeistech.android.searchspot.gurunaviAPI.gurunaviModel.gurunaviData.response.rest.PR;

import java.security.Timestamp;

/**
 * Created by Masashi Hamaguchi on 2017/02/28.
 */

public class Rest {

    @SerializedName("@attributes")
    public Order order;
    public String id;
    @SerializedName("update_date")
    public Timestamp updateDate;
    public String name;
    @SerializedName("name_kana")
    public String nameKana;
    public int latitude;

    public int longitude;
    public String category;
    public String url;
    @SerializedName("url_mobile")
    public String urlMobile;
    @SerializedName("coupon_url")
    public CouponURL couponURL;

    @SerializedName("image_url")
    public ImageURL imageURL;
    public String address;
    public String tel;
    @SerializedName("tel_sub")
    public String telSub;
    public String fax;

    public String opentime;
    public String holiday;
    public Access access;
    @SerializedName("parking_lots")
    public int parkingLots;
    public PR pr;

    public Code code;
    public int budget;
    public int party;
    public int lunch;
    @SerializedName("credit_card")
    public String creditCard;

    @SerializedName("e_money")
    public String eMoney;
    public Flags flags;


    public Rest(Order order, String id, Timestamp updateDate, String name, String nameKana, int latitude, int longitude, String category, String url, String urlMobile, CouponURL couponURL, ImageURL imageURL, String address, String tel, String telSub, String fax, String opentime, String holiday, Access access, int parkingLots, PR pr, Code code, int budget, int party, int lunch, String creditCard, String eMoney, Flags flags) {
        this.order = order;
        this.id = id;
        this.updateDate = updateDate;
        this.name = name;
        this.nameKana = nameKana;
        this.latitude = latitude;
        this.longitude = longitude;
        this.category = category;
        this.url = url;
        this.urlMobile = urlMobile;
        this.couponURL = couponURL;
        this.imageURL = imageURL;
        this.address = address;
        this.tel = tel;
        this.telSub = telSub;
        this.fax = fax;
        this.opentime = opentime;
        this.holiday = holiday;
        this.access = access;
        this.parkingLots = parkingLots;
        this.pr = pr;
        this.code = code;
        this.budget = budget;
        this.party = party;
        this.lunch = lunch;
        this.creditCard = creditCard;
        this.eMoney = eMoney;
        this.flags = flags;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameKana() {
        return nameKana;
    }

    public void setNameKana(String nameKana) {
        this.nameKana = nameKana;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlMobile() {
        return urlMobile;
    }

    public void setUrlMobile(String urlMobile) {
        this.urlMobile = urlMobile;
    }

    public CouponURL getCouponURL() {
        return couponURL;
    }

    public void setCouponURL(CouponURL couponURL) {
        this.couponURL = couponURL;
    }

    public ImageURL getImageURL() {
        return imageURL;
    }

    public void setImageURL(ImageURL imageURL) {
        this.imageURL = imageURL;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTelSub() {
        return telSub;
    }

    public void setTelSub(String telSub) {
        this.telSub = telSub;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        this.parkingLots = parkingLots;
    }

    public PR getPr() {
        return pr;
    }

    public void setPr(PR pr) {
        this.pr = pr;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getParty() {
        return party;
    }

    public void setParty(int party) {
        this.party = party;
    }

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String geteMoney() {
        return eMoney;
    }

    public void seteMoney(String eMoney) {
        this.eMoney = eMoney;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }
}
