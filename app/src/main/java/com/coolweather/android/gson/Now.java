package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/7/10.
 */

//JSON格式
//"now":{
//        "tmp":29,
//        "cond":{
//            "txt":"阵雨"
//        }
//}

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
