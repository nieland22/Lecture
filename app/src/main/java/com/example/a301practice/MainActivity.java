package com.example.a301practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar mySeekBar = (SeekBar)findViewById(R.id.imgSeekBar);

        MySurfaceView theSV = (MySurfaceView)findViewById(R.id.surfaceView);

        SeekBarListener tempListener = new SeekBarListener();

        mySeekBar.setOnSeekBarChangeListener(tempListener);

    }


}
