package com.example.akihiro.vibration_e14c1004;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onStart(View v){
        // バイブレーションスタート（1秒：1000ミリ秒）
        ((Vibrator) getSystemService(Context.VIBRATOR_SERVICE)).vibrate(1000);
    }
}
