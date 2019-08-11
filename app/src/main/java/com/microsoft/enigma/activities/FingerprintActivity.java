package com.microsoft.enigma.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.microsoft.enigma.R;

import moe.feng.support.biometricprompt.BiometricPromptCompat;

public class FingerprintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fingerprint_activity);

        final BiometricPromptCompat biometricPrompt = new BiometricPromptCompat.Builder(this)
                .setTitle("Title")
                .setSubtitle("Subtitle")
                .setDescription("Description: blablablablablablablablablablabla...")
                .setNegativeButton("Use password", (DialogInterface dialog, int which) ->
                        Toast.makeText(
                                FingerprintActivity.this,
                                "You requested password.",
                                Toast.LENGTH_LONG).show())
                .build();

        biometricPrompt.authenticate(new CancellationSignal(), new BiometricPromptCompat.IAuthenticationCallback() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public void onAuthenticationError(int errorCode, @Nullable CharSequence errString) {
                Toast.makeText(FingerprintActivity.this, "Authentication error\n" + errString, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAuthenticationHelp(int helpCode, @Nullable CharSequence helpString) {
                Toast.makeText(FingerprintActivity.this, "Authentication error\n" + helpString, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPromptCompat.IAuthenticationResult result) {
                Toast.makeText(FingerprintActivity.this, "Success!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAuthenticationFailed() {
                Toast.makeText(FingerprintActivity.this, "Authentication failed", Toast.LENGTH_LONG).show();
            }
        });
    }
}