package com.templatemela.camscanner.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.templatemela.camscanner.AppOpenManager;
import com.templatemela.camscanner.R;
import com.templatemela.camscanner.Savepref;

public class SplashActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash_acvtivity);

        Savepref savepref=new Savepref(SplashActivity.this);
        savepref.setsubid(0);
        AppOpenManager appOpenManager = new AppOpenManager(SplashActivity.this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        },1000);
    }
}
