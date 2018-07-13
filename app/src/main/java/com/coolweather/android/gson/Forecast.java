package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/7/10.
 */

//JSON格式
//"daily_forecast":[
//        {
//            "data":"2016-08-08",
//            "cond":{
//                "txt_d":"阵雨"
//            },
//            "tmp":{
//                "max":"34",
//                "min":"27"
//            }
//        },
//        {
//            "data":"2016-08-09",
//            "cond":{
//                "txt_d":"多云"
//            },
//            "tmp":{
//                "max":"35",
//                "min":"29"
//            }
//        },
//        ...
//]

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
