package com.example.viewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = findViewById(R.id.etName);
        Button btnRED = findViewById(R.id.btnRED);
        Button btnBLUE = findViewById(R.id.btnBLUE);
        Button btnGREEN = findViewById(R.id.btnGREEN);

        View.OnClickListener btnlistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button)view;
                if (btn==btnRED) {
                    etName.setTextColor(Color.RED);
                } else if (btn==btnBLUE) {
                    etName.setTextColor(Color.BLUE);
                }else if (btn==btnGREEN) {
                    etName.setTextColor(Color.GREEN);
                }
            }
        };

        btnRED.setOnClickListener(btnlistener);
        btnBLUE.setOnClickListener(btnlistener);
        btnGREEN.setOnClickListener(btnlistener);
    }
}