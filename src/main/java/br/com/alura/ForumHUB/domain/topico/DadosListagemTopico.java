package br.com.alura.ForumHUB.domain.topico;

import br.com.alura.ForumHUB.domain.autor.DadosDetalhamentoAutor;
import br.com.alura.ForumHUB.domain.curso.Curso;
import br.com.alura.ForumHUB.domain.resposta.DadosDetalhamentoResposta;

import java.time.LocalDateTime;
import java.util.List;

public record DadosListagemTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime data,
        Boolean duvidaResolvida,
        DadosDetalhamentoAutor autor,
        Curso curso,
        List<DadosDetalhamentoResposta> respostas
) {
}
