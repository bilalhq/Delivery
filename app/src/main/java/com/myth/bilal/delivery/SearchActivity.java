package com.myth.bilal.delivery;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    TextView textViewSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        textViewSearch = (TextView) findViewById(R.id.txtSearch);
        textViewSearch.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        final int interval = 3000; // 1 Second
        Handler handler = new Handler();
        Runnable runnable = new Runnable(){
            public void run() {
                Intent intent = new Intent(SearchActivity.this,InfoActivity.class);
                startActivity(intent);
            }
        };
        handler.postAtTime(runnable, System.currentTimeMillis()+interval);
        handler.postDelayed(runnable, interval);



    }
}
