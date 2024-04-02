package com.giovannibf.myliwind.entities;

import java.time.Duration;

public class ReadNovels {

    String name;
    Duration duration;
    Integer totalPages;
    Integer pagesRead;
    String summary;

    public ReadNovels() {
    }

    public ReadNovels(String name, Duration duration) {
        this.name = name;
        this.duration = duration;
    }

    /**
    AddToDailyHabitList();

    AddToCalendar();
     **/
}
