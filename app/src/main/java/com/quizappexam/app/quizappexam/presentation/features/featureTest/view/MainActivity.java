package com.quizappexam.app.quizappexam.presentation.features.featureTest.view;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.quizappexam.app.quizappexam.R;
import com.quizappexam.app.quizappexam.presentation.base.view.SingleFragmentActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends SingleFragmentActivity implements MainView{



    @Override
    protected Fragment createFragment() {
        return new MainFragment();
    }




}
