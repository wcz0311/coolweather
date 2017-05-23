package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WCZ on 2017/5/22.
 */

public class Suggestion {
    public Air air;
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("drsg")
    public DressSuggestion dressSuggestion;
    public Flu flu;
    public Sport sport;
    @SerializedName("trav")
    public Travel travel;
    @SerializedName("uv")
    public Ultraviolet ultraviolet;

    public class Air {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    public class Comfort {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    public class DressSuggestion {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    public class Flu {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    public class Travel {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    public class Ultraviolet {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }
}
