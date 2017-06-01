package com.example.theopsyphertxt.electid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView forgotPassword;
    TextView companyEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forgotPassword = (TextView) findViewById(R.id.btnForgotPassword);
        //on click of highlight text forgot password
        forgotPassword.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        companyEmail = (TextView) findViewById(R.id.btnSignInCompanyId);
        //on click of highlight sentence company ID
        companyEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    //on LogIn button click
    public void signIn (View view) {
        Intent intent = new Intent(this, Page1Activity.class);
        startActivity(intent);
    }
}
