package com.hsf.moduletest;

import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hsf.baselibs.BaseApplication;

public class MainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Daisy", "MainApplication启动" + getTheContext());

        if (isDebug()) {
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(this);
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
