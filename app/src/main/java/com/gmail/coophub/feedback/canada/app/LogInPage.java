package com.gmail.coophub.feedback.canada.app;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LogInPage extends AppCompatActivity {

    private Typeface tf, tf2;
    private LinearLayout linear;
    private int navigationBarHeight, resourceId;
    private TextView tv1, tv2;
    private EditText et1, et2;
    private Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        linear = (LinearLayout) findViewById(R.id.logInLayout);

        navigationBarHeight = 0;
        resourceId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            navigationBarHeight = getResources().getDimensionPixelSize(resourceId);
        }

        if (navigationBarHeight != 0){
            linear.setPadding(0,0, 0, navigationBarHeight);
        }

        tf = Typeface.createFromAsset(getAssets(),"fonts/Montserrat-SemiBold.ttf");
        tf2 = Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");

        tv1 = (TextView) findViewById(R.id.logInDescription);
        tv2 = (TextView) findViewById(R.id.logInMainTitle);
        tv1.setTypeface(tf);
        tv2.setTypeface(tf2);

        et1 = (EditText) findViewById(R.id.editText2);
        et2 = (EditText) findViewById(R.id.editText3);
        et1.setTypeface(tf);
        et2.setTypeface(tf);

        logIn = (Button) findViewById(R.id.log_in_log_in_button);
        logIn.setTypeface(tf);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInPage.this, ConnectPage.class));
            }
        });
    }
}
