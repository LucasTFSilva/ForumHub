package br.com.alura.ForumHUB.domain.topico;

import br.com.alura.ForumHUB.domain.curso.Curso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;

public record DadosCriacaoTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotBlank
        Long idAutor,

        @NotNull
        @Valid
        Curso curso
) {
}
