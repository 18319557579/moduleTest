package com.hsf.moduletest;

import android.util.Log;

import com.hsf.baselibs.BaseApplication;

public class MainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Daisy", "MainApplication启动" + getTheContext());
    }
}
