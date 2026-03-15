package com.example.project11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    EditText et;
    String stringUrl;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        wv.getSettings().setJavaScriptEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = (WebView)findViewById(R.id.wv);
        et = (EditText) findViewById(R.id.url);
    }
    public void go(View view) {
        stringUrl = et.getText().toString();
        wv.loadUrl(stringUrl);
    }
    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
