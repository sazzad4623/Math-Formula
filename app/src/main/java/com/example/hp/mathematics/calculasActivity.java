package com.example.hp.mathematics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class calculasActivity extends AppCompatActivity {
    WebSettings wSettings;
    WebView webView;
    ProgressBar progressBar;


    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculas);

        Log.d("fahmidul", "http_link");

        Intent intn = getIntent();
//        String url_link = intn.getStringExtra("url");
        String url_link = "file:///android_asset/formula/ssc/math/part1/index1.html";
        Log.d("fahmidul", url_link);

        webView = (WebView) findViewById(R.id.show_formula_web);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        webView.setWebViewClient(new myWebClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url_link);

//		wSettings = webView.getSettings();
//		wSettings.setJavaScriptEnabled(true);
//		webView.addJavascriptInterface(this, "Android");
//		webView.loadUrl(url_link);


    }

    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            progressBar.setVisibility(View.GONE);
        }
    }

}
