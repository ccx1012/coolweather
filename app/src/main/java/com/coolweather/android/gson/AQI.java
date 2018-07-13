package com.coolweather.android.gson;

/**
 * Created by Administrator on 2018/7/10.
 */

//JSON格式
//"aqi":{
//        "city":{
//            "aqi":"44"
//            "pm25":"13"
//        }
//}


public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
