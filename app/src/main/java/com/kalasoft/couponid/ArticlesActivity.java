package com.kalasoft.couponid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArticlesActivity extends AppCompatActivity {

    private TextView article0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        article0 = (TextView) findViewById(R.id.textView);
        article0.setText("Articles about nature");

        article0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //https://www.nature.com/nature/articles?type=article
                Intent intent=new Intent(ArticlesActivity.this,ReadArticleActivity.class);
                startActivity(intent);
            }
        });
    }
}