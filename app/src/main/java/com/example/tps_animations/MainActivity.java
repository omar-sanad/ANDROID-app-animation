package com.example.tps_animations;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView image = findViewById(R.id.image);
// zoom in animation
        findViewById(R.id.buttomZoomIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in
                ));
            }
        });
// zoom out animation
        findViewById(R.id.buttomZoomOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_out
                ));
            }
        });
// fade in animation
        findViewById(R.id.buttomFadeIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_in
                ));
            }
        });
// fade out animation
        findViewById(R.id.buttomFadeOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_out
                ));
            }
        });
// slide left animation
        findViewById(R.id.buttomSlideLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_left
                ));
            }
        });
// slide right animation
        findViewById(R.id.buttomSlideRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_right
                ));
            }
        });
// slide up animation
        findViewById(R.id.buttomSlideUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_up
                ));
            }
        });
// slide down animation
        findViewById(R.id.buttomSlideDown).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_down
                ));
            }
        });
// zoom in and fade in animation
        findViewById(R.id.buttomZoomInFadeIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in_fade_in
                ));
            }
        });
// zoom out and fade out animation
        findViewById(R.id.buttomZoomOutFadeOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_out_fade_out
                ));
            }
        });
// rotate animation
        findViewById(R.id.buttomRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.rotate
                ));
            }
        });
// move animation
        findViewById(R.id.buttomMove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.move
                ));
            }
        });
    }
}
