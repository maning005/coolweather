package maning.btmc.cn.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 102015038 on 2017/8/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}
