package com.gmail.coophub.feedback.canada.app;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConnectPage extends AppCompatActivity {

    private Typeface tf, tf2;
    private TextView tv1, tv2;
    private LinearLayout linear;
    private int navigationBarHeight, resourceId;
    private Button employer, student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        linear = (LinearLayout) findViewById(R.id.connectLayout);

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

        tv1 = (TextView) findViewById(R.id.connectMainTitle);
        tv2 = (TextView) findViewById(R.id.connectDescription);
        tv1.setTypeface(tf2);
        tv2.setTypeface(tf);

        employer = (Button) findViewById(R.id.employer_button);
        employer.setTypeface(tf);
        employer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConnectPage.this, EmployerHomePage.class));
            }
        });

        student = (Button) findViewById(R.id.student_button);
        student.setTypeface(tf);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConnectPage.this, StudentHomePage.class));
            }
        });
    }

}
