package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio( @JsonAlias("Titulo")  String titulo,
							 @JsonAlias("Episodio") Integer numero,
							 @JsonAlias("imdbRating") String  avaliacao,
							 @JsonAlias("Released") String dataLancamento) {

}
