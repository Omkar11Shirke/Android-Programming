package com.example.context;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
private TextView txt1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.txt1);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
                MenuInflater menuInflater=getMenuInflater();
                menuInflater.inflate(R.menu.menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(MainActivity.this);
                popupMenu.show();
            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.it_SHARE:
                Toast.makeText(this, "SHARE", Toast.LENGTH_SHORT).show();
                break;

            case R.id.it_EDIT:
                Toast.makeText(this, "EDIT", Toast.LENGTH_SHORT).show();
                break;

            case R.id.it_DELETE:
                Toast.makeText(this, "DELETE", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}