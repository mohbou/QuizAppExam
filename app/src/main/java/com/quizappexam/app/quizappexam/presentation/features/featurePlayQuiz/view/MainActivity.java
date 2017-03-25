package com.quizappexam.app.quizappexam.presentation.features.featurePlayQuiz.view;

import android.support.v4.app.Fragment;

import com.quizappexam.app.quizappexam.presentation.base.view.SingleFragmentActivity;

public class MainActivity extends SingleFragmentActivity implements MainView{



    @Override
    protected Fragment createFragment() {
        return new MainFragment();
    }




}
