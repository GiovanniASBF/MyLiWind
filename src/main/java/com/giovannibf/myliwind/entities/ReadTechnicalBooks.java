package com.giovannibf.myliwind.entities;

import java.time.Duration;

public class ReadTechnicalBooks {

    String name;
    Duration duration;
    Integer totalPages;
    Integer pagesRead;
    String summary;

    public ReadTechnicalBooks() {
    }

    public ReadTechnicalBooks(String name, Duration duration) {
        this.name = name;
        this.duration = duration;
    }

    /**
    AddToDailyHabitList();

    AddToCalendar();
     **/
}
