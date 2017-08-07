package maning.btmc.cn.coolweather.gson;

/**
 * Created by 102015038 on 2017/8/6.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
