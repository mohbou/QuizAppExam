package com.quizappexam.app.quizappexam.presentation.features.featureTest.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.quizappexam.app.quizappexam.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView{

    @BindView(R.id.testText)
    TextView mTextView;

    @BindView(R.id.btn_ok)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
    @OnClick(R.id.btn_ok)
    public void onSayHelloClicked(View view) {
        mTextView.setText("Clicked");

    }
}
