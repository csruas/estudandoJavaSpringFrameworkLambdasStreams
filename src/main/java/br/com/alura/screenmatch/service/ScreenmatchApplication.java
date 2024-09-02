package br.com.alura.screenmatch.service;

import java.security.Principal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import br.com.alura.screenmatch.principal.ExibirMenuPrincipal;

public class ScreenmatchApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		SpringApplication.run(ScreenmatchApplication.class, args);

	}

	public static void main(String[] args) {
		ExibirMenuPrincipal principal = new ExibirMenuPrincipal();
		principal.exibeMenu();

	}

}
