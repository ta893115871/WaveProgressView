package com.gxz.waveprogressview;

import android.animation.ObjectAnimator;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;

public class MainActivity extends AppCompatActivity {

    private WaveProgressView waveProgressView_0, waveProgressView_1, waveProgressView_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waveProgressView_0 = (WaveProgressView) findViewById(R.id.wpv_0);
        waveProgressView_1 = (WaveProgressView) findViewById(R.id.wpv_1);
        waveProgressView_2 = (WaveProgressView) findViewById(R.id.wpv_2);
        waveProgressView_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });
    }

    public void start(View view) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(waveProgressView_0, "progress", 0f, 100f);
        objectAnimator0.setDuration(3300);
        objectAnimator0.setInterpolator(new LinearInterpolator());
        objectAnimator0.start();

        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(waveProgressView_1, "progress", 0f, 80f);
        objectAnimator1.setDuration(3000);
        objectAnimator1.setInterpolator(new AccelerateInterpolator());
        objectAnimator1.start();

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(waveProgressView_2, "progress", 0f, 120f);
        objectAnimator2.setDuration(5000);
        objectAnimator2.setInterpolator(new BounceInterpolator());
        objectAnimator2.start();
    }
}
