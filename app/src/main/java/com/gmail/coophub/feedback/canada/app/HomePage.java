package com.gmail.coophub.feedback.canada.app;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    View block1, block2, block3, block4, block5, block6;
    Animation anim1, anim2, anim3, anim4, anim5, anim6;
    Integer animationDuration;
    Button sign_in, main_page_log_in;
    Typeface tf;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout linear = (LinearLayout) findViewById(R.id.buttonLayout);

        int navigationBarHeight = 0;
        int resourceId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            navigationBarHeight = getResources().getDimensionPixelSize(resourceId);
        }

        if (navigationBarHeight != 0){
            linear.setPadding(0,0, 0, navigationBarHeight);
        }

        tf = Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Medium.ttf");
        tv = (TextView) findViewById(R.id.text_main_title);
        tv.setTypeface(tf);

        main_page_log_in = (Button) findViewById(R.id.main_page_log_in_button);
        main_page_log_in.setTypeface(tf);
        main_page_log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this, LogInPage.class));
            }
        });

        sign_in = (Button) findViewById(R.id.main_page_sign_in_button);
        sign_in.setTypeface(tf);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this, SignUpPage.class));
            }
        });

        block1 = findViewById(R.id.block1);
        block2 = findViewById(R.id.block2);
        block3 = findViewById(R.id.block3);
        block4 = findViewById(R.id.block4);
        block5 = findViewById(R.id.block5);
        block6 = findViewById(R.id.block6);

        animationDuration = 5000;

        animate();

    }

    @Override
    protected void onResume() {
        super.onResume();
        animate();
    }

    public void animate(){
        anim1 = AnimationUtils.loadAnimation(this, R.anim.main_page_row1);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.main_page_row1);
        anim3 = AnimationUtils.loadAnimation(this, R.anim.main_page_row1);
        anim4 = AnimationUtils.loadAnimation(this, R.anim.main_page_row2);
        anim5 = AnimationUtils.loadAnimation(this, R.anim.main_page_row2);
        anim6 = AnimationUtils.loadAnimation(this, R.anim.main_page_row2);

        anim1.setDuration(animationDuration);
        anim2.setDuration(animationDuration);
        anim3.setDuration(animationDuration);
        anim4.setDuration(animationDuration);
        anim5.setDuration(animationDuration);
        anim6.setDuration(animationDuration);


        anim1.setRepeatCount(Animation.INFINITE);
        anim2.setRepeatCount(Animation.INFINITE);
        anim3.setRepeatCount(Animation.INFINITE);
        anim4.setRepeatCount(Animation.INFINITE);
        anim5.setRepeatCount(Animation.INFINITE);
        anim6.setRepeatCount(Animation.INFINITE);

        anim2.setStartOffset(animationDuration/3);
        anim3.setStartOffset(animationDuration/3*2);
        anim5.setStartOffset(animationDuration/3);
        anim6.setStartOffset(animationDuration/3*2);

        anim2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {
                anim2.setStartOffset(0);
            }

            @Override
            public void onAnimationEnd(Animation animation) {}
        });
        anim3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {
                anim3.setStartOffset(0);
            }

            @Override
            public void onAnimationEnd(Animation animation) {}
        });
        anim5.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {
                anim5.setStartOffset(0);
            }

            @Override
            public void onAnimationEnd(Animation animation) {}
        });
        anim6.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {
                anim6.setStartOffset(0);
            }

            @Override
            public void onAnimationEnd(Animation animation) {}
        });

        block1.setAnimation(anim1);
        block2.setAnimation(anim2);
        block3.setAnimation(anim3);
        block4.setAnimation(anim4);
        block5.setAnimation(anim5);
        block6.setAnimation(anim6);
    }
}
