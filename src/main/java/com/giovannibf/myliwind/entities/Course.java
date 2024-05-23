package com.giovannibf.myliwind.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Lesson> lessons;
    private String ability;

    public Course(String name, String ability){
        this.name = name;
        this.ability = ability;
        this.lessons = new ArrayList<>();
    }

    public void addLessons(Lesson lesson) {
        lessons.add(lesson);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public String getAbilities() {
        return ability;
    }

    public int getTotalLessons() {
        return lessons.size();
    }
}
