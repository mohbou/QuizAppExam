package com.quizappexam.app.quizappexam.presentation.dagger;

import android.content.Context;

import dagger.Module;

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }

}
