package com.hsf.baselibs;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hsf.baselibs.databinding.ActivityBaseBinding;

import java.util.Random;

public abstract class BaseActivity extends AppCompatActivity {

    protected String className;
    ActivityBaseBinding activityBaseBinding;

    {
        Random random = new Random();
        int randomNum = random.nextInt(999999);
        className = String.valueOf(randomNum);
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBaseBinding = ActivityBaseBinding.inflate(getLayoutInflater());
        setContentView(activityBaseBinding.getRoot());
        Log.d("Daisy", "onCreate回调 " + getClass().getName() + " " + className);

        activityBaseBinding.tvClassName.setText(getClass().getName() + " " + className + " ");

        activityBaseBinding.btnGetTask.setVisibility(View.VISIBLE);
        activityBaseBinding.btnGetTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Daisy", "获得task " + getTaskId());
                activityBaseBinding.btnGetTask.setText("获得task " + getTaskId());
            }
        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("Daisy", "onNewIntent回调 " + getClass().getName() + " "+ className);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Daisy", "onStart回调 " + getClass().getName() + " " + className);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Daisy", "onResume回调 " + getClass().getName() + " " + className);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Daisy", "onPause回调 " + getClass().getName() + " " + className);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Daisy", "onStop回调 " + getClass().getName() + " " + className);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Daisy", "onDestroy回调 " + getClass().getName() + " " + className);
    }

    protected void setClickGetTask(View.OnClickListener onClickListener) {
        Button btnGetTask = findViewById(R.id.btn_get_task);
        btnGetTask.setVisibility(View.VISIBLE);
        btnGetTask.setOnClickListener(onClickListener);
    }

    protected Button setClickSkip1(View.OnClickListener onClickListener) {
        Button btnSkip1 = ((Button)findViewById(R.id.btn_skip_1));
        btnSkip1.setVisibility(View.VISIBLE);
        btnSkip1.setOnClickListener(onClickListener);
        return btnSkip1;
    }

    protected Button setClickSkip2(View.OnClickListener onClickListener) {
        Button btnSkip2 = ((Button)findViewById(R.id.btn_skip_2));
        btnSkip2.setVisibility(View.VISIBLE);
        btnSkip2.setOnClickListener(onClickListener);
        return btnSkip2;
    }

    protected Button setClickSkip3(View.OnClickListener onClickListener) {
        Button btnSkip3 = ((Button)findViewById(R.id.btn_skip_3));
        btnSkip3.setVisibility(View.VISIBLE);
        btnSkip3.setOnClickListener(onClickListener);
        return btnSkip3;
    }

    protected Button setClickSkip4(View.OnClickListener onClickListener) {
        Button btnSkip4 = ((Button)findViewById(R.id.btn_skip_4));
        btnSkip4.setVisibility(View.VISIBLE);
        btnSkip4.setOnClickListener(onClickListener);
        return btnSkip4;
    }

    protected Button setClickSkip5(View.OnClickListener onClickListener) {
        Button btnSkip4 = ((Button)findViewById(R.id.btn_skip_5));
        btnSkip4.setVisibility(View.VISIBLE);
        btnSkip4.setOnClickListener(onClickListener);
        return btnSkip4;
    }

    protected Button setClickSkip6(View.OnClickListener onClickListener) {
        Button btnSkip4 = ((Button)findViewById(R.id.btn_skip_6));
        btnSkip4.setVisibility(View.VISIBLE);
        btnSkip4.setOnClickListener(onClickListener);
        return btnSkip4;
    }

    protected Button setClickSkip7(View.OnClickListener onClickListener) {
        Button btnSkip4 = ((Button)findViewById(R.id.btn_skip_7));
        btnSkip4.setVisibility(View.VISIBLE);
        btnSkip4.setOnClickListener(onClickListener);
        return btnSkip4;
    }

    protected Button setClickSkip8(View.OnClickListener onClickListener) {
        Button btnSkip4 = ((Button)findViewById(R.id.btn_skip_8));
        btnSkip4.setVisibility(View.VISIBLE);
        btnSkip4.setOnClickListener(onClickListener);
        return btnSkip4;
    }

    protected Button setClickSkip9(View.OnClickListener onClickListener) {
        Button btnSkip4 = ((Button)findViewById(R.id.btn_skip_9));
        btnSkip4.setVisibility(View.VISIBLE);
        btnSkip4.setOnClickListener(onClickListener);
        return btnSkip4;
    }
}
