package com.kalasoft.couponid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GamesActivity extends AppCompatActivity {
    private ImageButton game0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        game0 = (ImageButton) findViewById(R.id.imageButton);

        game0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(
                        "https://play.google.com/store/apps/details?id=com.tencent.ig"));
                intent.setPackage("com.android.vending");
                startActivity(intent);
            }
        });

    }
}