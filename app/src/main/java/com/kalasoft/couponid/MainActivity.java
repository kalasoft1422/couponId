package com.kalasoft.couponid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button butSteps,butArticles,butGames;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

         butSteps = (Button) findViewById(R.id.butSteps);
         butArticles = (Button) findViewById(R.id.butArticles);
         butGames = (Button) findViewById(R.id.butGames);

         butSteps.setText("Steps Taken \n Computing...");
         butArticles.setText("Articles");
         butGames.setText("Games");

         butSteps.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 intent = new Intent(MainActivity.this,KSMapActivity.class);
                 startActivity(intent);
             }
         });


         butArticles.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 intent = new Intent(MainActivity.this,ArticlesActivity.class);
                 startActivity(intent);
             }
         });

         butGames.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 intent = new Intent(MainActivity.this,GamesActivity.class);
                 startActivity(intent);
             }
         });

    }
}