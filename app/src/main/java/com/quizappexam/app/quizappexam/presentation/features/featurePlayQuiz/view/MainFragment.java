package com.quizappexam.app.quizappexam.presentation.features.featurePlayQuiz.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.quizappexam.app.quizappexam.R;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        ButterKnife.bind(this,view);
        return view;
    }


    @OnClick(R.id.btn_start_test)
    public void onSayHelloClicked(View view) {

    }
}
