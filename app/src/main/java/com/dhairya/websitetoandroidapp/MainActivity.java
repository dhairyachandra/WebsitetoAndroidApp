package com.dhairya.websitetoandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.web);
        wv.loadUrl("http://www.gadgetsdesk.com");   // YOUR WEBSITE NAME
    }
}
