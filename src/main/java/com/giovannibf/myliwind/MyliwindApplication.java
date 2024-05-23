package com.giovannibf.myliwind;

import com.giovannibf.myliwind.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MyliwindApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyliwindApplication.class, args);

		Course javaCourse = new Course("Java for beginners", "Java programming");
		javaCourse.addLessons(new Lesson("Java introduction", "Basic concepts of Java"));
		javaCourse.addLessons(new Lesson("Control structures", "If-else, loops, and switch"));

		OnlineStudy meuHabitoJava = new OnlineStudy("Java course","Study programming every day", javaCourse);
		meuHabitoJava.completeTheLesson(javaCourse.getLessons().get(0)); // Concluding the first lesson

		meuHabitoJava.trackProgress();
	}

}
