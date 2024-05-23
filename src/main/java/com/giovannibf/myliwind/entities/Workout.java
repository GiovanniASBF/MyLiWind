package com.giovannibf.myliwind.entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Workout extends Habit{

    List<Exercise> exercisesList; //list of exercises performed

    public Workout(String name, String description, List<Exercise> exercisesList) {
        super(name, description);
        this.exercisesList = new ArrayList<>(exercisesList);
    }

    @Override
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

