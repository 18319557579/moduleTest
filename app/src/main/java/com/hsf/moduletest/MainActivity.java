package com.hsf.moduletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
//        setContentView(R.layout.activity_main);

        /*btnSkipLogin = findViewById(R.id.btn_skip_button);
        btnSkipLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });*/

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
                ARouter.getInstance().build("/login/login").navigation();
            }
        }).setText("用ARouter跳转Login");


        setClickSkip4(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/member/member").navigation();
            }
        }).setText("用ARouter跳转Member");


    }
}