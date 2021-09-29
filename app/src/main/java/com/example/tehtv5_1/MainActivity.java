package com.example.tehtv5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int hits;
    private int create;
    private int visible;
    private SharedPreferences mieltymykset;

    public void hitNappi(View v) {
        TextView tv = findViewById(R.id.hitsTxt);
        hits++;
        tv.setText(Integer.toString(hits));
    }
    public void resetNappi(View v) {
        TextView tv1 = findViewById(R.id.creationsTxt);
        TextView tv2 = findViewById(R.id.visiblesTxt);
        TextView tv3 = findViewById(R.id.hitsTxt);
        tv1.setText(Integer.toString(0));
        tv2.setText(Integer.toString(0));
        hits = 0;
        tv3.setText(Integer.toString(hits));
    }
    protected void onPause() {
        super.onPause();
        TextView tv = findViewById(R.id.)
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.creationsTxt);
        create++;
        tv.setText(Integer.toString(create));


    }
}