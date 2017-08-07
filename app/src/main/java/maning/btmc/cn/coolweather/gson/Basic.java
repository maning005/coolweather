package maning.btmc.cn.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 102015038 on 2017/8/6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    private class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
