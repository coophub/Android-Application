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
import java.util.regex.Pattern;

public class SignUpPage extends AppCompatActivity {

    Typeface tf, tf2;
    EditText et2;

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

        et2 = (EditText) findViewById(R.id.editText3);
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
                if (checkEmail(String.valueOf(et2.getText()))){
                }
                startActivity(new Intent(SignUpPage.this, ConnectPage.class));
            }
        });
    }

    public void checkPassword(String password){

        // Check if there's a digit
        String regDigit = "(?=.*\\d)";
        Pattern pattern = Pattern.compile(regDigit);
        Boolean boolDigit = pattern.matcher(password).matches();

        // Check if there's a lowercase character
        String regLower = "(?=.*[a-z])";
        pattern = Pattern.compile(regLower);
        Boolean boolLower = pattern.matcher(password).matches();

        // Check if there's a uppercase character
        String regUpper = "(?=.*[A-Z])";
        pattern = Pattern.compile(regUpper);
        Boolean boolUpper = pattern.matcher(password).matches();

        // Check if it contains @, #, $ or %
        String regSpecial = "(?=.*[@#$%])";
        pattern = Pattern.compile(regSpecial);
        Boolean boolSpecial = pattern.matcher(password).matches();

        // Check if it's between 6 and 20 characters
        String regLength = ".{6,20}";
        pattern = Pattern.compile(regLength);
        Boolean boolLength = pattern.matcher(password).matches();


    }

    public Boolean checkEmail(String email){
        String regEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regEmail);
        Boolean boolEmail = pattern.matcher(email).matches();
        return boolEmail;
    }
}
