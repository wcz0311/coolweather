package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/23.
 */

public class DetailMore {
    @SerializedName("code_d")
    public String codeDay;
    @SerializedName("code_n")
    public String codeNight;
    @SerializedName("txt_d")
    public String infoDay;
    @SerializedName("txt_n")
    public String infoNight;
}
