package com.giovannibf.myliwind.entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Workout extends Habit{

    char days_training;
    int minutesDuration; //training duration in minutes
    List<Exercise> exercisesList; //list of exercises performed

    public Workout(String id, String name, String description, int minutesDuration, List<Exercise> exercisesList) {
        super(id, name, description);
        this.minutesDuration = minutesDuration;
        this.exercisesList = new ArrayList<>(exercisesList);
    }

    public void trackProgress(){
        System.out.println("Tracking progress of workout habit:");
        System.out.println("Habit description: " + getDescription());

        System.out.println("Exercises performed:");
        for (Exercise exercise : exercisesList) {
            System.out.println("- " + exercise);
        }
    }

    /**
    AddToDailyHabitList();

    AddToWorkoutList();

    AddToCalendar();
     **/
}

