package com.hsf.moduletest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hsf.baselibs.BaseActivity;
import com.hsf.login.LoginActivity;
import com.hsf.member.MemberActivity;

public class MainActivity extends BaseActivity {

    Button btnSkipLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setClickSkip1(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }).setText("跳转LoginActivity");

        setClickSkip2(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberActivity.class);
                startActivity(intent);
            }
        }).setText("跳转MemberActivity");

        setClickSkip3(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/login/login")
                        .withString("name", "hsf")
                        .navigation(MainActivity.this, 100);
            }
        }).setText("用ARouter跳转Login（携带数据，并期望返回数据）");


        setClickSkip4(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/member/member").navigation();
            }
        }).setText("用ARouter跳转Member");


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 100:
                if (resultCode == RESULT_OK) {
                    String resultData = data.getStringExtra("result");
                    Log.d("Daisy", "数据已返回" + resultData);
                }
        }
    }
}