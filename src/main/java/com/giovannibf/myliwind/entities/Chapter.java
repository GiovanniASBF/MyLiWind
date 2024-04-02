package com.giovannibf.myliwind.entities;

public class Chapter {
    private String issueTitle;
    private String author;

    public Chapter(String issueTitle, String author) {
        this.issueTitle = issueTitle;
        this.author = author;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Chapter: " + issueTitle + ", Author: " + author;
    }
}
