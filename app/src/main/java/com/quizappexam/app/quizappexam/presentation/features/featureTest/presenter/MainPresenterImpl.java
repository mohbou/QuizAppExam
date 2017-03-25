package com.quizappexam.app.quizappexam.presentation.features.featureTest.presenter;

import com.quizappexam.app.quizappexam.presentation.features.featureTest.model.BoundaryIntercator;
import com.quizappexam.app.quizappexam.presentation.features.featureTest.view.MainView;

public class MainPresenterImpl implements MainPresenter {

    private BoundaryIntercator mBoundaryIntercator;
    private MainView mMainView;

    public MainPresenterImpl(BoundaryIntercator boundaryIntercator, MainView mainView) {
        mBoundaryIntercator = boundaryIntercator;
        mMainView = mainView;
    }
}
