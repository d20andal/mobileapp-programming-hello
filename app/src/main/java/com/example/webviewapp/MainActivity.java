package com.example.webviewapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myWebView = findViewById(R.id.my_webview);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.getSettings().setJavaScriptEnabled(true);

        myWebView.loadUrl("file:///android_asset/html");
        myWebView.loadUrl("https://his.se");


    }

    private void showExternalWebPage() {

        myWebView.loadUrl("https://www.his.se");
    }

    private void showInternalWebPage() {
        myWebView.loadUrl("file:///android_asset/html");
    }

}


