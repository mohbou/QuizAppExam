package com.quizappexam.app.quizappexam.presentation.features.featurePlayQuiz.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quizappexam.app.quizappexam.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuizFragment extends Fragment{


    @BindView(R.id.recycler_view_answers)
    RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_quiz_question, container, false);
        ButterKnife.bind(this,view);
        return view;
    }
}
