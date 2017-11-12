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

public class SignUpPage extends AppCompatActivity {

    Typeface tf, tf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        LinearLayout linear = (LinearLayout) findViewById(R.id.signInLayout);

        int navigationBarHeight = 0;
        int resourceId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            navigationBarHeight = getResources().getDimensionPixelSize(resourceId);
        }

        if (navigationBarHeight != 0){
            linear.setPadding(0,0, 0, navigationBarHeight);
        }

        tf = Typeface.createFromAsset(getAssets(),"fonts/Montserrat-SemiBold.ttf");
        tf2 = Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");

        TextView tv1 = (TextView) findViewById(R.id.signUpDescription);
        tv1.setTypeface(tf);


        TextView tv2 = (TextView) findViewById(R.id.signUpMainTitle);
        tv2.setTypeface(tf2);

        EditText et1 = (EditText) findViewById(R.id.editText2);
        et1.setTypeface(tf);

        EditText et2 = (EditText) findViewById(R.id.editText3);
        et2.setTypeface(tf);

        EditText et3 = (EditText) findViewById(R.id.firstName);
        et3.setTypeface(tf);

        EditText et4 = (EditText) findViewById(R.id.lastName);
        et4.setTypeface(tf);

        Button sign_in = (Button) findViewById(R.id.sign_in_sign_in_button);
        sign_in.setTypeface(tf);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpPage.this, ConnectPage.class));
            }
        });
    }
}
