package com.example.c4q.quizzy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent intent;
        intent = new Intent(getApplicationContext(),QuizActivity.class);

        startActivity(intent);
    }
    private Context getContext(){
        return null;
    }
}
