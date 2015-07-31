package com.jacob.gif;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GifView gifView = (GifView) findViewById(R.id.gifView);
        gifView.setMovieResource(R.raw.ble);
    }

}
