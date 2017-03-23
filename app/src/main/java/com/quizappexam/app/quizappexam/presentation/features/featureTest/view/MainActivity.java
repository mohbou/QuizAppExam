package com.quizappexam.app.quizappexam.presentation.features.featureTest.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.quizappexam.app.quizappexam.R;

public class MainActivity extends AppCompatActivity implements MainView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
