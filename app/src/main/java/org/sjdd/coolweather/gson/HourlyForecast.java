package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class HourlyForecast {
    @SerializedName("cond")
    public SimpleMore more;
    public String date;
    @SerializedName("hum")
    public String humidity;
    @SerializedName("pop")
    public String probabilityOfPrecipitation;
    @SerializedName("pres")
    public String pressure;
    @SerializedName("tmp")
    public String temperature;
    public Wind wind;
}
