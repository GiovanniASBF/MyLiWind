package com.giovannibf.myliwind.entities;

public class Lesson {
    private String title;
    private String contentLearned;

    public Lesson(String title, String contentLearned) {
        this.title = title;
        this.contentLearned = contentLearned;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getContentLearned() {
        return contentLearned;
    }
}
