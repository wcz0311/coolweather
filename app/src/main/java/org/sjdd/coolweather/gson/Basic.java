package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("cnty")
    public String countryName;
    @SerializedName("id")
    public String weatherId;
    @SerializedName("lat")
    public String latitude;
    @SerializedName("lon")
    public String longitude;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
        @SerializedName("utc")
        public String coordinatedUniversalTime;
    }
}
