package com.hsf.baselibs;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class BaseApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Daisy", "BaseApplication 启动");

        context = getApplicationContext();
    }

    public static Context getTheContext() {
        return context;
    }
}
