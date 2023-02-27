package com.hsf.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.hsf.baselibs.BaseActivity;
import com.hsf.baselibs.ServiceProvider;

@Route(path = "/login/login")
public class LoginActivity extends BaseActivity {

    @Autowired(name = "name")
    protected String myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
/*        Intent intent = getIntent();
        if (intent != null) {
            String nameParam = intent.getStringExtra("name");
            Toast.makeText(LoginActivity.this, nameParam, Toast.LENGTH_SHORT).show();
        }*/

        Toast.makeText(LoginActivity.this, "自动安装的：" + myName, Toast.LENGTH_SHORT).show();

        Intent intent1 = new Intent();
        intent1.putExtra("result", "这是返回的信息");
        setResult(RESULT_OK, intent1);

        setClickSkip1(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceProvider serviceProvider = (ServiceProvider) (ARouter.getInstance()
                        .build(ServiceProvider.SingleServicePath)
                        .navigation());
                serviceProvider.showMessage();
            }
        }).setText("调用WebView的服务");
    }
}