package br.com.zup.dinamica_em_grupo_biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "livro")
public class LivroEntity {
    private Long id;
    private String isbn;
    private String nome;
    private String autor;
    private String editora;
    private Date anoPublicacao;
    private boolean disponivel;

    public LivroEntity() {
    }

    public LivroEntity(Long id, String isbn, String nome, String autor, String editora, Date anoPublicacao, boolean disponivel) {
        this.id = id;
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
