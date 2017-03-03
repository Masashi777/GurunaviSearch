
package com.lifeistech.android.searchspot.hotpepperAPI.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shop {

    @SerializedName("name_kana")
    @Expose
    private String nameKana;
    @SerializedName("other_memo")
    @Expose
    private String otherMemo;
    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("large_area")
    @Expose
    private LargeArea largeArea;
    @SerializedName("sommelier")
    @Expose
    private String sommelier;
    @SerializedName("party_capacity")
    @Expose
    private String partyCapacity;
    @SerializedName("large_service_area")
    @Expose
    private LargeServiceArea largeServiceArea;
    @SerializedName("mobile_access")
    @Expose
    private String mobileAccess;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("course")
    @Expose
    private String course;
    @SerializedName("show")
    @Expose
    private String show;
    @SerializedName("parking")
    @Expose
    private String parking;
    @SerializedName("non_smoking")
    @Expose
    private String nonSmoking;
    @SerializedName("horigotatsu")
    @Expose
    private String horigotatsu;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("genre")
    @Expose
    private Genre genre;
    @SerializedName("open")
    @Expose
    private String open;
    @SerializedName("card")
    @Expose
    private String card;
    @SerializedName("tatami")
    @Expose
    private String tatami;
    @SerializedName("charter")
    @Expose
    private String charter;
    @SerializedName("wifi")
    @Expose
    private String wifi;
    @SerializedName("equipment")
    @Expose
    private String equipment;
    @SerializedName("sub_genre")
    @Expose
    private SubGenre subGenre;
    @SerializedName("shop_detail_memo")
    @Expose
    private String shopDetailMemo;
    @SerializedName("band")
    @Expose
    private String band;
    @SerializedName("middle_area")
    @Expose
    private MiddleArea middleArea;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("karaoke")
    @Expose
    private String karaoke;
    @SerializedName("logo_image")
    @Expose
    private String logoImage;
    @SerializedName("midnight")
    @Expose
    private String midnight;
    @SerializedName("budget")
    @Expose
    private Budget budget;
    @SerializedName("urls")
    @Expose
    private Urls urls;
    @SerializedName("english")
    @Expose
    private String english;
    @SerializedName("lunch")
    @Expose
    private String lunch;
    @SerializedName("service_area")
    @Expose
    private ServiceArea serviceArea;
    @SerializedName("close")
    @Expose
    private String close;
    @SerializedName("budget_memo")
    @Expose
    private String budgetMemo;
    @SerializedName("tv")
    @Expose
    private String tv;
    @SerializedName("private_room")
    @Expose
    private String privateRoom;
    @SerializedName("coupon_urls")
    @Expose
    private CouponUrls couponUrls;
    @SerializedName("barrier_free")
    @Expose
    private String barrierFree;
    @SerializedName("sub_food")
    @Expose
    private SubFood subFood;
    @SerializedName("small_area")
    @Expose
    private SmallArea smallArea;
    @SerializedName("wedding")
    @Expose
    private String wedding;
    @SerializedName("access")
    @Expose
    private String access;
    @SerializedName("ktai")
    @Expose
    private String ktai;
    @SerializedName("child")
    @Expose
    private String child;
    @SerializedName("capacity")
    @Expose
    private String capacity;
    @SerializedName("open_air")
    @Expose
    private String openAir;
    @SerializedName("pet")
    @Expose
    private String pet;
    @SerializedName("free_food")
    @Expose
    private String freeFood;
    @SerializedName("food")
    @Expose
    private Food food;
    @SerializedName("ktai_coupon")
    @Expose
    private String ktaiCoupon;
    @SerializedName("station_name")
    @Expose
    private String stationName;
    @SerializedName("catch")
    @Expose
    private String _catch;
    @SerializedName("free_drink")
    @Expose
    private String freeDrink;

    /**
     * 
     * @return
     *     The nameKana
     */
    public String getNameKana() {
        return nameKana;
    }

    /**
     * 
     * @param nameKana
     *     The name_kana
     */
    public void setNameKana(String nameKana) {
        this.nameKana = nameKana;
    }

    /**
     * 
     * @return
     *     The otherMemo
     */
    public String getOtherMemo() {
        return otherMemo;
    }

    /**
     * 
     * @param otherMemo
     *     The other_memo
     */
    public void setOtherMemo(String otherMemo) {
        this.otherMemo = otherMemo;
    }

    /**
     * 
     * @return
     *     The photo
     */
    public Photo getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo
     *     The photo
     */
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    /**
     * 
     * @return
     *     The largeArea
     */
    public LargeArea getLargeArea() {
        return largeArea;
    }

    /**
     * 
     * @param largeArea
     *     The large_area
     */
    public void setLargeArea(LargeArea largeArea) {
        this.largeArea = largeArea;
    }

    /**
     * 
     * @return
     *     The sommelier
     */
    public String getSommelier() {
        return sommelier;
    }

    /**
     * 
     * @param sommelier
     *     The sommelier
     */
    public void setSommelier(String sommelier) {
        this.sommelier = sommelier;
    }

    /**
     * 
     * @return
     *     The partyCapacity
     */
    public String getPartyCapacity() {
        return partyCapacity;
    }

    /**
     * 
     * @param partyCapacity
     *     The party_capacity
     */
    public void setPartyCapacity(String partyCapacity) {
        this.partyCapacity = partyCapacity;
    }

    /**
     * 
     * @return
     *     The largeServiceArea
     */
    public LargeServiceArea getLargeServiceArea() {
        return largeServiceArea;
    }

    /**
     * 
     * @param largeServiceArea
     *     The large_service_area
     */
    public void setLargeServiceArea(LargeServiceArea largeServiceArea) {
        this.largeServiceArea = largeServiceArea;
    }

    /**
     * 
     * @return
     *     The mobileAccess
     */
    public String getMobileAccess() {
        return mobileAccess;
    }

    /**
     * 
     * @param mobileAccess
     *     The mobile_access
     */
    public void setMobileAccess(String mobileAccess) {
        this.mobileAccess = mobileAccess;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The course
     */
    public String getCourse() {
        return course;
    }

    /**
     * 
     * @param course
     *     The course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * 
     * @return
     *     The show
     */
    public String getShow() {
        return show;
    }

    /**
     * 
     * @param show
     *     The show
     */
    public void setShow(String show) {
        this.show = show;
    }

    /**
     * 
     * @return
     *     The parking
     */
    public String getParking() {
        return parking;
    }

    /**
     * 
     * @param parking
     *     The parking
     */
    public void setParking(String parking) {
        this.parking = parking;
    }

    /**
     * 
     * @return
     *     The nonSmoking
     */
    public String getNonSmoking() {
        return nonSmoking;
    }

    /**
     * 
     * @param nonSmoking
     *     The non_smoking
     */
    public void setNonSmoking(String nonSmoking) {
        this.nonSmoking = nonSmoking;
    }

    /**
     * 
     * @return
     *     The horigotatsu
     */
    public String getHorigotatsu() {
        return horigotatsu;
    }

    /**
     * 
     * @param horigotatsu
     *     The horigotatsu
     */
    public void setHorigotatsu(String horigotatsu) {
        this.horigotatsu = horigotatsu;
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
     *     The genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * 
     * @param genre
     *     The genre
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * 
     * @return
     *     The open
     */
    public String getOpen() {
        return open;
    }

    /**
     * 
     * @param open
     *     The open
     */
    public void setOpen(String open) {
        this.open = open;
    }

    /**
     * 
     * @return
     *     The card
     */
    public String getCard() {
        return card;
    }

    /**
     * 
     * @param card
     *     The card
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * 
     * @return
     *     The tatami
     */
    public String getTatami() {
        return tatami;
    }

    /**
     * 
     * @param tatami
     *     The tatami
     */
    public void setTatami(String tatami) {
        this.tatami = tatami;
    }

    /**
     * 
     * @return
     *     The charter
     */
    public String getCharter() {
        return charter;
    }

    /**
     * 
     * @param charter
     *     The charter
     */
    public void setCharter(String charter) {
        this.charter = charter;
    }

    /**
     * 
     * @return
     *     The wifi
     */
    public String getWifi() {
        return wifi;
    }

    /**
     * 
     * @param wifi
     *     The wifi
     */
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    /**
     * 
     * @return
     *     The equipment
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * 
     * @param equipment
     *     The equipment
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    /**
     * 
     * @return
     *     The subGenre
     */
    public SubGenre getSubGenre() {
        return subGenre;
    }

    /**
     * 
     * @param subGenre
     *     The sub_genre
     */
    public void setSubGenre(SubGenre subGenre) {
        this.subGenre = subGenre;
    }

    /**
     * 
     * @return
     *     The shopDetailMemo
     */
    public String getShopDetailMemo() {
        return shopDetailMemo;
    }

    /**
     * 
     * @param shopDetailMemo
     *     The shop_detail_memo
     */
    public void setShopDetailMemo(String shopDetailMemo) {
        this.shopDetailMemo = shopDetailMemo;
    }

    /**
     * 
     * @return
     *     The band
     */
    public String getBand() {
        return band;
    }

    /**
     * 
     * @param band
     *     The band
     */
    public void setBand(String band) {
        this.band = band;
    }

    /**
     * 
     * @return
     *     The middleArea
     */
    public MiddleArea getMiddleArea() {
        return middleArea;
    }

    /**
     * 
     * @param middleArea
     *     The middle_area
     */
    public void setMiddleArea(MiddleArea middleArea) {
        this.middleArea = middleArea;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The karaoke
     */
    public String getKaraoke() {
        return karaoke;
    }

    /**
     * 
     * @param karaoke
     *     The karaoke
     */
    public void setKaraoke(String karaoke) {
        this.karaoke = karaoke;
    }

    /**
     * 
     * @return
     *     The logoImage
     */
    public String getLogoImage() {
        return logoImage;
    }

    /**
     * 
     * @param logoImage
     *     The logo_image
     */
    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    /**
     * 
     * @return
     *     The midnight
     */
    public String getMidnight() {
        return midnight;
    }

    /**
     * 
     * @param midnight
     *     The midnight
     */
    public void setMidnight(String midnight) {
        this.midnight = midnight;
    }

    /**
     * 
     * @return
     *     The budget
     */
    public Budget getBudget() {
        return budget;
    }

    /**
     * 
     * @param budget
     *     The budget
     */
    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    /**
     * 
     * @return
     *     The urls
     */
    public Urls getUrls() {
        return urls;
    }

    /**
     * 
     * @param urls
     *     The urls
     */
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    /**
     * 
     * @return
     *     The english
     */
    public String getEnglish() {
        return english;
    }

    /**
     * 
     * @param english
     *     The english
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * 
     * @return
     *     The lunch
     */
    public String getLunch() {
        return lunch;
    }

    /**
     * 
     * @param lunch
     *     The lunch
     */
    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    /**
     * 
     * @return
     *     The serviceArea
     */
    public ServiceArea getServiceArea() {
        return serviceArea;
    }

    /**
     * 
     * @param serviceArea
     *     The service_area
     */
    public void setServiceArea(ServiceArea serviceArea) {
        this.serviceArea = serviceArea;
    }

    /**
     * 
     * @return
     *     The close
     */
    public String getClose() {
        return close;
    }

    /**
     * 
     * @param close
     *     The close
     */
    public void setClose(String close) {
        this.close = close;
    }

    /**
     * 
     * @return
     *     The budgetMemo
     */
    public String getBudgetMemo() {
        return budgetMemo;
    }

    /**
     * 
     * @param budgetMemo
     *     The budget_memo
     */
    public void setBudgetMemo(String budgetMemo) {
        this.budgetMemo = budgetMemo;
    }

    /**
     * 
     * @return
     *     The tv
     */
    public String getTv() {
        return tv;
    }

    /**
     * 
     * @param tv
     *     The tv
     */
    public void setTv(String tv) {
        this.tv = tv;
    }

    /**
     * 
     * @return
     *     The privateRoom
     */
    public String getPrivateRoom() {
        return privateRoom;
    }

    /**
     * 
     * @param privateRoom
     *     The private_room
     */
    public void setPrivateRoom(String privateRoom) {
        this.privateRoom = privateRoom;
    }

    /**
     * 
     * @return
     *     The couponUrls
     */
    public CouponUrls getCouponUrls() {
        return couponUrls;
    }

    /**
     * 
     * @param couponUrls
     *     The coupon_urls
     */
    public void setCouponUrls(CouponUrls couponUrls) {
        this.couponUrls = couponUrls;
    }

    /**
     * 
     * @return
     *     The barrierFree
     */
    public String getBarrierFree() {
        return barrierFree;
    }

    /**
     * 
     * @param barrierFree
     *     The barrier_free
     */
    public void setBarrierFree(String barrierFree) {
        this.barrierFree = barrierFree;
    }

    /**
     * 
     * @return
     *     The subFood
     */
    public SubFood getSubFood() {
        return subFood;
    }

    /**
     * 
     * @param subFood
     *     The sub_food
     */
    public void setSubFood(SubFood subFood) {
        this.subFood = subFood;
    }

    /**
     * 
     * @return
     *     The smallArea
     */
    public SmallArea getSmallArea() {
        return smallArea;
    }

    /**
     * 
     * @param smallArea
     *     The small_area
     */
    public void setSmallArea(SmallArea smallArea) {
        this.smallArea = smallArea;
    }

    /**
     * 
     * @return
     *     The wedding
     */
    public String getWedding() {
        return wedding;
    }

    /**
     * 
     * @param wedding
     *     The wedding
     */
    public void setWedding(String wedding) {
        this.wedding = wedding;
    }

    /**
     * 
     * @return
     *     The access
     */
    public String getAccess() {
        return access;
    }

    /**
     * 
     * @param access
     *     The access
     */
    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * 
     * @return
     *     The ktai
     */
    public String getKtai() {
        return ktai;
    }

    /**
     * 
     * @param ktai
     *     The ktai
     */
    public void setKtai(String ktai) {
        this.ktai = ktai;
    }

    /**
     * 
     * @return
     *     The child
     */
    public String getChild() {
        return child;
    }

    /**
     * 
     * @param child
     *     The child
     */
    public void setChild(String child) {
        this.child = child;
    }

    /**
     * 
     * @return
     *     The capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * 
     * @param capacity
     *     The capacity
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * 
     * @return
     *     The openAir
     */
    public String getOpenAir() {
        return openAir;
    }

    /**
     * 
     * @param openAir
     *     The open_air
     */
    public void setOpenAir(String openAir) {
        this.openAir = openAir;
    }

    /**
     * 
     * @return
     *     The pet
     */
    public String getPet() {
        return pet;
    }

    /**
     * 
     * @param pet
     *     The pet
     */
    public void setPet(String pet) {
        this.pet = pet;
    }

    /**
     * 
     * @return
     *     The freeFood
     */
    public String getFreeFood() {
        return freeFood;
    }

    /**
     * 
     * @param freeFood
     *     The free_food
     */
    public void setFreeFood(String freeFood) {
        this.freeFood = freeFood;
    }

    /**
     * 
     * @return
     *     The food
     */
    public Food getFood() {
        return food;
    }

    /**
     * 
     * @param food
     *     The food
     */
    public void setFood(Food food) {
        this.food = food;
    }

    /**
     * 
     * @return
     *     The ktaiCoupon
     */
    public String getKtaiCoupon() {
        return ktaiCoupon;
    }

    /**
     * 
     * @param ktaiCoupon
     *     The ktai_coupon
     */
    public void setKtaiCoupon(String ktaiCoupon) {
        this.ktaiCoupon = ktaiCoupon;
    }

    /**
     * 
     * @return
     *     The stationName
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 
     * @param stationName
     *     The station_name
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 
     * @return
     *     The _catch
     */
    public String getCatch() {
        return _catch;
    }

    /**
     * 
     * @param _catch
     *     The catch
     */
    public void setCatch(String _catch) {
        this._catch = _catch;
    }

    /**
     * 
     * @return
     *     The freeDrink
     */
    public String getFreeDrink() {
        return freeDrink;
    }

    /**
     * 
     * @param freeDrink
     *     The free_drink
     */
    public void setFreeDrink(String freeDrink) {
        this.freeDrink = freeDrink;
    }

}
