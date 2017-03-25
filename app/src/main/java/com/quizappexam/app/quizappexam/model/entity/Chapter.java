package com.quizappexam.app.quizappexam.model.entity;

import java.util.List;

public class Chapter {

    private int chapterId;
    private String chapterName;
    private List<Question> questionsInChapter;

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public List<Question> getQuestionsInChapter() {
        return questionsInChapter;
    }

    public void setQuestionsInChapter(List<Question> questionsInChapter) {
        this.questionsInChapter = questionsInChapter;
    }
}
