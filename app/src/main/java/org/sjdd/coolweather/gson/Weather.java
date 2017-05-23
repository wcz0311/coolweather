package org.sjdd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by WCZ on 2017/5/22.
 */

public class Weather {
    public List<Alarm> alarms;
    public AQI aqi;
    public Basic basic;
    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyForecastList;
    @SerializedName("hourly_forecast")
    public List<HourlyForecast> hourlyForecastList;
    public Now now;
    public String status;
    public Suggestion suggestion;
}
