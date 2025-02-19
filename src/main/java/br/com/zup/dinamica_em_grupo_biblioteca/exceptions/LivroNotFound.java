package br.com.zup.dinamica_em_grupo_biblioteca.exceptions;

public class LivroNotFound extends RuntimeException{
    public LivroNotFound(String message) {
        super(message);
    }
}
