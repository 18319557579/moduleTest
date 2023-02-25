package com.hsf.baselibs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

public class SchemeFilterActivity extends LogActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri uri = getIntent().getData();
        Log.d("Daisy", "监听到的Uri：" + uri);

        ARouter.getInstance().build(uri).navigation();
        finish();
    }
}