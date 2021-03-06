package com.futuregeic.jameltraders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (Utilities.isConnectingToInternet(SplashActivity.this)){
                    startActivity(new Intent(SplashActivity.this, WebActivity.class));
                }else {
                    Toast.makeText(SplashActivity.this, "Check your Internet and try again", Toast.LENGTH_SHORT).show();
                }
                finishAffinity();
            }
        }, 4000);
    }
}