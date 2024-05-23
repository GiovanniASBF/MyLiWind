package com.giovannibf.myliwind.entities;

import java.time.LocalDate;

public abstract class Habit {
    private String name;
    private String description;
    private LocalDate startDate;
    int minutesDuration;

    public Habit(String name, String description) {
        this.name = name;
        this.description = description;
        this.minutesDuration = minutesDuration;
    }

    public abstract void trackProgress();
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
