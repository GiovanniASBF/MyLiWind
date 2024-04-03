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

		ReadBooks myReadHabit = new ReadBooks("03", "Ler Percy Jackson", "Acompanhando minha leitura de Percy Jackson", 120);

		Book book1 = new Book("1984", "George Orwell", 328);
		myReadHabit.startNewBook(book1);
		myReadHabit.readPages(50); // Simula a leitura de 50 páginas

		Book book2 = new Book("Clean Code", "Robert C. Martin", 464);
		myReadHabit.startNewBook(book2);
		myReadHabit.readPages(90); // Simula a leitura de 90 páginas

		myReadHabit.trackProgress();
	}

}
