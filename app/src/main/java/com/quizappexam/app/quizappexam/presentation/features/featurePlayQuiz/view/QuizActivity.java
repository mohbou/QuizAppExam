package com.quizappexam.app.quizappexam.presentation.features.featurePlayQuiz.view;

import android.support.v4.app.Fragment;

import com.quizappexam.app.quizappexam.presentation.base.view.SingleFragmentActivity;


public class QuizActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new QuizFragment();
    }
}
