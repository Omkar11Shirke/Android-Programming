package com.example.greetngapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        EditText etNameText =(EditText) findViewById(R.id.etName);
        String nm = etNameText.getText().toString();
        String gr = "Hello " + nm;
        ((TextView)findViewById(R.id.txtGreeting)).setText(gr);
    }
}