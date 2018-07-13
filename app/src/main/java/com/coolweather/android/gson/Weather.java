package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/7/10.
 */

public class Weather {

    //返回的天气数据会包含一项stutas数据，成功返回ok,失败则会返回具体的原因，所以这里也需要添加一个对应的status字段
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
