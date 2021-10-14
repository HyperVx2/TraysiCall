package com.example.traysi_call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.traysi_call.ui.login.login;


public class MainActivity extends AppCompatActivity {
    private Button splashscreen_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Button splashscreen_button1 = findViewById(R.id.splashscreen_button1);
        splashscreen_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }
    public void login() {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
    }
}
