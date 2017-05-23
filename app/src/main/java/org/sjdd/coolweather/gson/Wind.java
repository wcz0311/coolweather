package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class Wind {
    @SerializedName("deg")
    public String degree;
    @SerializedName("dir")
    public String direction;
    @SerializedName("sc")
    public String scale;
    @SerializedName("spd")
    public String speed;
}
