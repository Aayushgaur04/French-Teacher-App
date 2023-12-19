package com.aayush.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button blackBtn, yellowBtn, purpleBtn, redBtn, greenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBTN);
        greenBtn = findViewById(R.id.greenBTN);
        purpleBtn = findViewById(R.id.purpleBTN);
        redBtn = findViewById(R.id.redBTN);
        yellowBtn = findViewById(R.id.yellowBTN);

        redBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.redBTN) {
            playSounds(R.raw.red);
        } else if (clickedBtnId == R.id.blackBTN) {
            playSounds(R.raw.black);
        } else if (clickedBtnId == R.id.greenBTN) {
            playSounds(R.raw.green);
        } else if (clickedBtnId == R.id.purpleBTN) {
            playSounds(R.raw.violet);
        } else if (clickedBtnId == R.id.yellowBTN) {
            playSounds(R.raw.yellow);
        }
    }

    public void playSounds(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }
}