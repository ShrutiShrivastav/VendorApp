package com.example.vendorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText et_email,et_pass;
private Button btn_login;
    boolean isEmailValid, isPasswordValid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et_email = findViewById(R.id.email);
        final EditText et_pass = findViewById(R.id.pass);
        Button btn_login = findViewById(R.id.login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwordInput = et_pass.getText().toString().trim();
                String email = et_email.getText().toString().trim();
                String password = et_pass.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    et_email.setError("Please enter an email address");
                    isEmailValid = false;
                } else
                    isEmailValid = true;
                if (TextUtils.isEmpty(password)) {
                    et_pass.setError("Please enter a password");
                    isPasswordValid = false;
                } else if (password.length() < 8) {
                    et_pass.setError("Password is too weak");
                    isPasswordValid = false;
                } else
                    isPasswordValid = true;

                if (isEmailValid && isPasswordValid) {
                    Toast.makeText(getApplicationContext(), "Successfully LoggedIn", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), VendorActivity.class));
                }
            }
        });
    }
}