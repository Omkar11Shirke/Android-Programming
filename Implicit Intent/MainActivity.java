package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayURL(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        String txt = ((EditText)findViewById(R.id.etURL)).getText().toString();
        i.setData(Uri.parse("https://"+txt));
        startActivity(i);
    }
}