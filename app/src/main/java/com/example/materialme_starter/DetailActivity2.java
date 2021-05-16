package com.example.materialme_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity2 extends AppCompatActivity {
    ImageView sportsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        //Open DetailActivity and initialize the ImageView and title TextView in onCreate():
        TextView sportsTitle = findViewById(R.id.titleDetail);
        sportsImage = findViewById(R.id.sportsImage);

        //Get the title from the incoming Intent and set it to the TextView:
        sportsTitle.setText(getIntent().getStringExtra("title"));



        Glide.with(this).load(getIntent().getIntExtra("image_resources",0)).into(sportsImage);
    }

    /**
     * Animate an ImageView 360 degrees and back.    *
     *
     */
    private void rotateView() {
        final ObjectAnimator animator = ObjectAnimator.ofFloat(sportsImage, View.ROTATION, 0f, 360f);
        animator.setDuration(1000);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(1);
        animator.start();
    }

    protected void fadeTransition(){

    }
}