package com.kwabena.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutALCBtn;
    Button myProfileBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutALCBtn = findViewById(R.id.about_alc_btn);
        myProfileBtn = findViewById(R.id.my_profile_btn);

        aboutALCBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToAbout = new Intent(MainActivity.this, About.class);
                startActivity(goToAbout);
            }
        });
        myProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToProfile = new Intent(MainActivity.this, Profile.class);
                startActivity(goToProfile);
            }
        });
    }
}
