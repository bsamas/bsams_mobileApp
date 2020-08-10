package com.example.regi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.Executor;



public class Final extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView msg_txt = findViewById(R.id.txt_msg);
        TextView login_btn = findViewById(R.id.login_btn);



      /* BiometricManager biometricManager = BiometricManager.from(this);
        switch(biometricManager.canAuthenticate()){
            case BiometricManager.BIOMETRIC_SUCCESS:
                msg_txt.setText(" you can use fingerprint sensor to take attendance");
                msg_txt.setTextColor(Color.parseColor("#fafafa"));
                break;

            case BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE:
                msg_txt.setText("No fingerprint sensor");
                login_btn.setVisibility(View.GONE);
                break;

            case BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE:
                msg_txt.setText("No fingerprint sensor is currently unavailable");
                login_btn.setVisibility(View.GONE);
                break;

            case BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED:
                msg_txt.setText("No saved fingerprint.check sequrityr");
                login_btn.setVisibility(View.GONE);
                break;



        }
        Executor executor = ContextCompat.getMainExecutor(this);

        final androidx.biometric.BiometricPrompt biometricPrompt = new androidx.biometric.BiometricPrompt(Final.this, executor, new androidx.biometric.BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
            }

            @Override
            public void onAuthenticationSucceeded(@NonNull androidx.biometric.BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(getApplicationContext(),"Attendance Success",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
            }
        });

        final androidx.biometric.BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder()
                .setTitle("attendence")
                .setDescription("use your fingerprint to take attendance")
                .setNegativeButtonText("cancel")
                .build();

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biometricPrompt.authenticate(promptInfo);
            }
        });

    }*/





   /* public void btn_final(View view) {
        startActivity(new Intent(getApplicationContext(),Final.class));
    }

    public void btn_finger(View view) {
        startActivity(new Intent(getApplicationContext(),Fingerprint.class));
    }*/
    }
}
