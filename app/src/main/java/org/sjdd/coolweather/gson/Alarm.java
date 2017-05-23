package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class Alarm {
    public String level;
    @SerializedName("stat")
    public String status;
    public String title;
    @SerializedName("txt")
    public String info;
    public String type;
}
