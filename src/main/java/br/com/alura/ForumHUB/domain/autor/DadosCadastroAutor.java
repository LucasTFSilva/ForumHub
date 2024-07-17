package br.com.alura.ForumHUB.domain.autor;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroAutor(
        @NotBlank
        String nome
) {
}
