package br.com.alura.ForumHUB.domain.autor;

public record DadosDetalhamentoAutor(Long id, String nome) {

    public DadosDetalhamentoAutor(Autor autor){
        this(autor.getId(), autor.getNome());
    }
}
