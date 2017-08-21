package com.walxy.loactionandimageview;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * 类用途 :Application入口类
 * 类的说明：本类是为了配置一些东西的
 * 作者 : 王兵洋
 * 时间 : 2017/8/21 9:03
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //创建默认的ImageLoader配置参数
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration
                .createDefault(this);
        ImageLoader.getInstance().init(configuration);
    }
}
