package com.hsf.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.launcher.ARouter;
import com.hsf.baselibs.LogActivity;

@Route(path = "/url/FirstActivity")
public class FirstActivity extends LogActivity {

    @Autowired
    String name;

    @Autowired
    int age;

    @Autowired(name = "/service/json")
    public ScoreBean scoreBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ARouter.getInstance().inject(this);
        SerializationService serializationService = ARouter.getInstance().navigation(SerializationService.class);
        serializationService.init(this);

        Log.d("Daisy", "打印传递的参数" + name + " " + age + " " + scoreBean);
    }
}