package maning.btmc.cn.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        //初始化各控件
        ScrollView weatherLayout= (ScrollView) findViewById(R.id.weath_layout);
        TextView title_city= (TextView) findViewById(R.id.title_city);
    }
}
