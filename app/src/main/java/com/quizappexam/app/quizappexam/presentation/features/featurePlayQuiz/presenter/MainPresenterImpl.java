package com.quizappexam.app.quizappexam.presentation.features.featurePlayQuiz.presenter;

import com.quizappexam.app.quizappexam.presentation.features.featurePlayQuiz.model.BoundaryIntercator;
import com.quizappexam.app.quizappexam.presentation.features.featurePlayQuiz.view.MainView;

public class MainPresenterImpl implements MainPresenter {

    private BoundaryIntercator mBoundaryIntercator;
    private MainView mMainView;

    public MainPresenterImpl(BoundaryIntercator boundaryIntercator, MainView mainView) {
        mBoundaryIntercator = boundaryIntercator;
        mMainView = mainView;
    }
}
