package com.giovannibf.myliwind.entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ReadBooks extends Habit {

    private Book currentBook;
    private int pagesReadCurrentBook;
    List<Book> booksRead;

    public ReadBooks(String id, String name, String description, int minutesDuration) {
        super(id, name, description, minutesDuration);
        this.booksRead = new ArrayList<>();
    }

    public void startNewBook(Book book){
        if (currentBook != null) {
            finishCurrentBook();
        }
        currentBook = book;
        pagesReadCurrentBook = 0;
    }

    public void readPages(int pages){
        if (currentBook == null){
            System.out.println("No book is being read at the moment.");
            return;
        }
        pagesReadCurrentBook += pages;
        System.out.println("You read " + pages + " pages of " + currentBook.getTitle());

        if (pagesReadCurrentBook >= currentBook.getTotalPages()) {
            finishCurrentBook();
        }
    }

    private void finishCurrentBook(){
        System.out.println("Congratulations! You have finished reading " + currentBook.getTitle());
        booksRead.add(currentBook);
        currentBook = null;
        pagesReadCurrentBook = 0;
    }

    @Override
    public void trackProgress(){
        System.out.println("Tracking the habit of reading books:");
        System.out.println("Total books read: " + booksRead.size());
        if (currentBook != null) {
            System.out.println("Currently reading: " + currentBook + " (" + pagesReadCurrentBook + " of " + currentBook.getTotalPages() + " pages read)");
        }
    }

    /**
    AddToDailyHabitList();

    AddToCalendar();
     **/
}
