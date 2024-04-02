package com.giovannibf.myliwind.entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ReadComicsAndManga extends Habit{
    String title;
    private List<Chapter> chaptersRead;

    public ReadComicsAndManga(String id, String name, String description, int minutesDuration, String title) {
        super(id, name, description, minutesDuration);
        this.title = title;
        this.chaptersRead = new ArrayList<>();
    }

    public void addChapterRead(Chapter capitulo) {
        chaptersRead.add(capitulo);
    }

    @Override
    public void trackProgress(){
        System.out.println("Tracking progress of read comics/mangas:");
        System.out.println("You are reading: " + title);
        System.out.println("Chapters read so far: " + chaptersRead.size());
        System.out.println("Detalhes dos capítulos lidos:");
        for (Chapter chapter : chaptersRead) {
            System.out.println("- " + chapter);
        }
    }

    /**
    AddToDailyHabitList();

    AddToCalendar();
     **/
}
