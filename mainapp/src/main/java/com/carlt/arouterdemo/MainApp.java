package com.carlt.arouterdemo;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Description:
 * Company    : carlt
 * Author     : zhanglei
 * Date       : 2019/3/8 16:18
 */
public class MainApp extends Application {
    public static final boolean DEBUG = true;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);


    }
}
