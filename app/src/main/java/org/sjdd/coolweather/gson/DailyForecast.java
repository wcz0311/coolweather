package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class DailyForecast {
    @SerializedName("astro")
    public Astronomy astronomy;
    @SerializedName("cond")
    public DetailMore more;
    public String date;
    @SerializedName("hum")
    public String humidity;
    @SerializedName("pcpn")
    public String precipitation;
    @SerializedName("pop")
    public String probabilityOfPrecipitation;
    @SerializedName("pres")
    public String pressure;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("uv")
    public String ultraviolet;
    @SerializedName("vis")
    public String visibility;
    public Wind wind;

    public class Astronomy {
        @SerializedName("mr")
        public String monthRise;
        @SerializedName("ms")
        public String monthset;
        @SerializedName("sr")
        public String sunRise;
        @SerializedName("ss")
        public String sunset;
    }

    public class Temperature {
        public String max;
        public String min;
    }
}
