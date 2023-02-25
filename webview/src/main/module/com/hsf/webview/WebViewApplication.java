package com.hsf.webview;

import android.app.Application;
import android.util.Log;

import com.hsf.baselibs.BaseApplication;

public class WebViewApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Daisy", "WebViewApplication启动 " + getTheContext());
    }
}
