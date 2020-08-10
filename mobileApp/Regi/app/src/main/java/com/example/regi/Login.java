package com.example.regi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login page");
    }


    public void btn_signup(View view) {
       startActivity(new Intent(getApplicationContext(),Signup.class));
    }

    public void btn_finger(View view) {
        startActivity(new Intent(getApplicationContext(),Fingerprint.class));
    }
    public void btn_final(View view) {
        startActivity(new Intent(getApplicationContext(),Final.class));
   }



}
