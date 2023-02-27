package com.hsf.baselibs;

import com.alibaba.android.arouter.facade.template.IProvider;

public abstract class ServiceProvider implements IProvider {
    public final static String SingleServicePath = "/service/singleService";

    public abstract void showMessage();
}
