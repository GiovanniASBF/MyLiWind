package com.giovannibf.myliwind;

import com.giovannibf.myliwind.entities.Exercise;
import com.giovannibf.myliwind.entities.Workout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MyliwindApplication {

	public static void main(String[] args) {

		//SpringApplication.run(MyliwindApplication.class, args);

		List<Exercise> todayExercises = Arrays.asList(
				new Exercise("Flexão", 3, 12),
				new Exercise("Abdominal", 3, 12),
				new Exercise("Agachamento", 3, 12)
		);

		Workout myWorkoutHabit = new Workout("01", "Treino de peito", "Rastreando meu treino de peito", 120, todayExercises);
		myWorkoutHabit.trackProgress();
	}

}
