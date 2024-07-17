package br.com.alura.ForumHUB.domain.topico;

import br.com.alura.ForumHUB.domain.autor.Autor;
import br.com.alura.ForumHUB.domain.autor.AutorRepository;
import br.com.alura.ForumHUB.domain.autor.DadosDetalhamentoAutor;
import br.com.alura.ForumHUB.infra.exception.exception.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private AutorRepository autorRepository;

    public DadosDetalhamentoTopico criarTopico(DadosCriacaoTopico dados){
        Autor autor = autorRepository.getReferenceById(dados.idAutor());
        var topico = new Topico(dados, autor);
        topicoRepository.save(topico);

        System.out.println(dados);
        System.out.println(autor);

        return null;
    }

    public DadosDetalhamentoTopico atualizarTopico(Long id, DadosAtualizacaoTopico dados){
        findTopicoById(id);
        var topico = topicoRepository.getReferenceById(id);

        return new DadosDetalhamentoTopico(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(),
                topico.getDuvidaResolvida(), new DadosDetalhamentoAutor(topico.getAutor()), topico.getCurso());
    }

    public DadosDetalhamentoTopico detalharTopico(Long id) {
        findTopicoById(id);
        var topico = topicoRepository.getReferenceById(id);
        return new DadosDetalhamentoTopico(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getDuvidaResolvida(), new DadosDetalhamentoAutor(topico.getAutor()), topico.getCurso());

    }

    public Long deletarTopico(Long id) {
        findTopicoById(id);
        topicoRepository.deleteById(id);
        return id;
    }

    public Topico findTopicoById(Long id) {
        return topicoRepository.findById(id)
                .orElseThrow(() -> new ValidacaoException("Tópico não encontrado"));
    }
}
