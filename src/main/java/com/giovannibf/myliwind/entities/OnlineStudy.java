package com.giovannibf.myliwind.entities;

import java.util.ArrayList;
import java.util.List;

public class OnlineStudy extends Habit{
    private Course currentCourse;
    private List<Lesson> completedLessons;

    public OnlineStudy(String name, String description, Course course) {
        super(name, description);
        this.currentCourse = course;
        this.completedLessons = new ArrayList<>();
    }

    public void completeTheLesson(Lesson lesson) {
        if (!currentCourse.getLessons().contains(lesson)) {
            System.out.println("This class is not part of the current course.");
            return;
        }

        completedLessons.add(lesson);
        System.out.println("Aula concluída: " + lesson.getTitle());
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking progress of the online course:");
        System.out.println("Course: " + currentCourse.getName());
        System.out.println("Learned skill: " + currentCourse.getAbilities());
        System.out.println("Total of completed lessons: " + completedLessons.size() + " of " + currentCourse.getTotalLessons());
        System.out.println("Completed lessons:");
        for (Lesson lesson : completedLessons) {
            System.out.println("- " + lesson.getTitle());
        }
    }
}
