package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/7/10.
 */

//JSON格式
//"basic":{
//        "city":"苏州"
//        "id":"CN101190401"
//        "update":{
//            "loc":"2016-08-08 21:58"
//        }
//}

public class Basic {

//    @SerializedName注解的方式让JSON字段和java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
