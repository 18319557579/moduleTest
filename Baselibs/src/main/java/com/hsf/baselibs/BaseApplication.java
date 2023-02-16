package com.hsf.baselibs;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Daisy", "BaseApplication 启动");

        context = getApplicationContext();

        if (isDebug()) {
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(this);
    }

    public static Context getTheContext() {
        return context;
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
