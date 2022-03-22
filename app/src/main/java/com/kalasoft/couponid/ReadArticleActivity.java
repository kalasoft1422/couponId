package com.kalasoft.couponid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ReadArticleActivity extends AppCompatActivity {

   private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_article);
        webView=new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.nature.com/nature/articles?type=article");
        setContentView(webView);
    }
}