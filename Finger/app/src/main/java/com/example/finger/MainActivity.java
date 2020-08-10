package com.example.finger;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView msg_txt = findViewById(R.id.txt_msg);
        TextView login_btn = findViewById(R.id.login_btn);



        BiometricManager biometricManager = BiometricManager.from(this);
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

        final BiometricPrompt biometricPrompt = new BiometricPrompt(MainActivity.this, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
            }

            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(getApplicationContext(),"Attendance Success",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
            }
        });

        final BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder()
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

        }






}
