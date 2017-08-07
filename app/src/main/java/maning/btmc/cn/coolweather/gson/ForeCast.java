package maning.btmc.cn.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 102015038 on 2017/8/6.
 */

public class ForeCast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
