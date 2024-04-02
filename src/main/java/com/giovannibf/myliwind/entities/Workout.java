package com.giovannibf.myliwind.entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Workout extends Habit{

    char days_training;
    int minutesDuration; //training duration in minutes
    List<Exercises> exercisesList; //list of exercises performed

    public Workout(String id, String name, String description, int minutesDuration, List<Exercises> exercisesList) {
        super(id, name, description);
        this.minutesDuration = minutesDuration;
        this.exercisesList = new ArrayList<>(exercisesList);
    }

    public void trackProgress(){

    }

    /**
    AddToDailyHabitList();

    AddToWorkoutList();

    AddToCalendar();
     **/
}

