package br.com.alura.ForumHUB.domain.autor;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Autor")
@Table(name = "autores")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Autor(DadosCadastroAutor dados){
        this.nome = dados.nome();
    }
}
