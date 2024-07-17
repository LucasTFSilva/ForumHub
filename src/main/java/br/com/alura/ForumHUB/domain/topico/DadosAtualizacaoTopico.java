package br.com.alura.ForumHUB.domain.topico;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        Boolean duvidaResolvida
) {
}
