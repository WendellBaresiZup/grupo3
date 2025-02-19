package br.com.zup.dinamica_em_grupo_biblioteca.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Isbn não pode ser nulo")
    private String isbn;

    @NotNull(message = "Nome não pode ser nulo")
    private String nome;

    @NotNull(message = "Autor não pode ser nulo")
    private String autor;

    @NotNull(message = "Editora não pode ser nulo")
    private String editora;

    @NotNull(message = "Ano de Publicação não pode ser nulo")
    private Date anoPublicacao;

    private boolean disponivel;

}