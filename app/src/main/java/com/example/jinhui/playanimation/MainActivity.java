package com.example.jinhui.playanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Android自定义view----音乐播放动画
 */
public class MainActivity extends AppCompatActivity {

    VoisePlayingIcon voisePlayingIcon;
    TextView ivPlaybarImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        voisePlayingIcon = (VoisePlayingIcon) findViewById(R.id.voise_playint_icon);
        ivPlaybarImage = (TextView) findViewById(R.id.iv_playbar_image);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voisePlayingIcon.start();

                // 帧动画
                if (!((AnimationDrawable) ivPlaybarImage.getBackground()).isRunning())
                    ((AnimationDrawable) ivPlaybarImage.getBackground()).start();

            }
        });

        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voisePlayingIcon.stop();

                if (((AnimationDrawable) ivPlaybarImage.getBackground()).isRunning())
                    ((AnimationDrawable) ivPlaybarImage.getBackground()).stop();
            }
        });
    }
}
