package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class Now {
    @SerializedName("cond")
    public SimpleMore more;
    @SerializedName("fl")
    public String feel;
    @SerializedName("hum")
    public String humidity;
    @SerializedName("pcpn")
    public String precipitation;
    @SerializedName("pres")
    public String pressure;
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("vis")
    public String visibility;
    public Wind wind;
}
