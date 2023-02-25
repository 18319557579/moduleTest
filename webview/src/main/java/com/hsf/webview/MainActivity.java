package com.hsf.webview;

import androidx.annotation.Nullable;

import android.os.Bundle;
import android.webkit.WebViewClient;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hsf.baselibs.LogActivity;
import com.hsf.webview.databinding.WebviewActivityMainBinding;

@Route(path = "/webView/main")
public class MainActivity extends LogActivity {

    WebviewActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = WebviewActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        binding.webView.getSettings().setJavaScriptEnabled(true);
//        binding.webView.setWebViewClient(new WebViewClient());
//        binding.webView.loadUrl("https://www.baidu.com");

        binding.webView.loadUrl("file:///android_asset/scheme-test.html");
    }
}