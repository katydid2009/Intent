package com.example.jam.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Jam on 2017/4/11.
 */

public class webViewTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_webview);
        Intent intent = getIntent();
        WebView WV = (WebView) findViewById(R.id.WebView);
        WV.loadUrl(intent.getDataString());
        WV.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }
}
