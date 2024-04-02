package com.giovannibf.myliwind;

import com.giovannibf.myliwind.entities.Chapter;
import com.giovannibf.myliwind.entities.Exercise;
import com.giovannibf.myliwind.entities.ReadComicsAndManga;
import com.giovannibf.myliwind.entities.Workout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MyliwindApplication {

	public static void main(String[] args) {

		//SpringApplication.run(MyliwindApplication.class, args);

		ReadComicsAndManga myReadManga = new ReadComicsAndManga("01", "Ler one piece", "Acompanhando minha leitura de One Piece", 120,"One Piece");
		myReadManga.addChapterRead(new Chapter("1000", "Eiichiro Oda"));
		myReadManga.addChapterRead(new Chapter("1001", "Eiichiro Oda"));
		myReadManga.trackProgress();
	}

}
