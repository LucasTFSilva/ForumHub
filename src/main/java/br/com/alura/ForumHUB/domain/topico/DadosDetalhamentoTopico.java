package br.com.alura.ForumHUB.domain.topico;

import br.com.alura.ForumHUB.domain.autor.DadosDetalhamentoAutor;
import br.com.alura.ForumHUB.domain.curso.Curso;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        Boolean duvidaResolvida,
        DadosDetalhamentoAutor autor,
        Curso curso
) {
    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getDuvidaResolvida(), new DadosDetalhamentoAutor(topico.getAutor()), topico.getCurso());
    }
}
