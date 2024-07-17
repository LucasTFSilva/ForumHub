package br.com.alura.ForumHUB.domain.resposta;

import br.com.alura.ForumHUB.domain.autor.DadosDetalhamentoAutor;

import java.time.LocalDateTime;

public record DadosDetalhamentoResposta(
        Long id,
        String mensagem,
        LocalDateTime data,
        DadosDetalhamentoAutor autor
) {
}
