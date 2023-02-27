package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChange=findViewById(R.id.btnChange);
        btnChange.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
                        MenuInflater inflater = popupMenu.getMenuInflater();
                        inflater.inflate(R.menu.popup,popupMenu.getMenu());
                        popupMenu.setOnMenuItemClickListener(MainActivity.this);
                        popupMenu.show();
                    }
                }
        );
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        TextView txt1=findViewById(R.id.txt1);
        switch (menuItem.getItemId()){
            case R.id.item_RED:
                txt1.setTextColor(Color.RED);
                break;
            case R.id.item_BLUE:
                txt1.setTextColor(Color.BLUE);
                break;
            case R.id.item_GREEN:
                txt1.setTextColor(Color.GREEN);
                break;
        }
        return true;
    }
}