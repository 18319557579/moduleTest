package com.hsf.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hsf.baselibs.BaseApplication;

public class MemberApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Daisy", "MemberApplication启动 " + getTheContext());
    }
}