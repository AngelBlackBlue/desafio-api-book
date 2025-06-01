package com.apibook.desafio.api.book;

import com.apibook.desafio.api.book.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesafioApiBookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApiBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
