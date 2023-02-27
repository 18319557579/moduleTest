package com.hsf.webview;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hsf.baselibs.ServiceProvider;

@Route(path = ServiceProvider.SingleServicePath)
public class SingleService extends ServiceProvider {

    private Context mContext;

    public void showMessage() {
        Toast.makeText(mContext, "对外提供的服务", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {
        mContext = context;
        Log.d("Daisy", "初始化完成了" + context);
    }
}
