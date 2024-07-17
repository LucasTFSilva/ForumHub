package br.com.alura.ForumHUB.controller;

import br.com.alura.ForumHUB.domain.autor.Autor;
import br.com.alura.ForumHUB.domain.autor.AutorRepository;
import br.com.alura.ForumHUB.domain.autor.DadosCadastroAutor;
import br.com.alura.ForumHUB.domain.autor.DadosDetalhamentoAutor;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastroAutor(@RequestBody @Valid DadosCadastroAutor dados, UriComponentsBuilder uriBuilder){
        var autor = new Autor(dados);
        repository.save(autor);

        var uri = uriBuilder.path("/autores/{id}")
                .buildAndExpand(autor.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoAutor(autor));
    }
}
