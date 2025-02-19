package br.com.zup.dinamica_em_grupo_biblioteca.service;


import br.com.zup.dinamica_em_grupo_biblioteca.model.LivroEntity;

import java.util.List;

public interface LivroService {

    List<LivroEntity> listarTodosLivros();

    void deleteLivro(Long id);
}
