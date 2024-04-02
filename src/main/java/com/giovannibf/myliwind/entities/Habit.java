package com.giovannibf.myliwind.entities;

import java.time.LocalDate;

public abstract class Habit {

    private String id;
    private String name;
    private String description;
    private LocalDate startDate;

    public Habit(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public abstract void trackProgress();

    public String getId() {
        return id;
    }

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
