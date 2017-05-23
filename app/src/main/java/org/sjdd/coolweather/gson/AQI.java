package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String co;
        public String no2;
        public String o3;
        public String pm10;
        public String pm25;
        @SerializedName("qlty")
        public String quality;
        public String so2;
    }
}
