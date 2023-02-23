package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private EditText etEmail;
private EditText etPwd;
private EditText etCnfPwd;
private Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPwd = findViewById(R.id.etPwd);
        etCnfPwd = findViewById(R.id.etCnfPwd);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etPwd.getText().toString().equals(etCnfPwd.getText().toString())){
                    Toast.makeText(MainActivity.this,"Login Succesful!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}