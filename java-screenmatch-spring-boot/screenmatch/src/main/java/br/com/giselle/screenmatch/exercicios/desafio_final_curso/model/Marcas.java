package br.com.giselle.screenmatch.exercicios.desafio_final_curso.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Marcas(
        String codigo,
        String nome
) {
}
