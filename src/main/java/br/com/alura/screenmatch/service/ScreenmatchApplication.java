package br.com.alura.screenmatch.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import br.com.alura.screenmatch.principal.ExibirMenuPrincipal;

public class ScreenmatchApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ExibirMenuPrincipal principal = new ExibirMenuPrincipal();
		principal.exibeMenu();
	}

}
