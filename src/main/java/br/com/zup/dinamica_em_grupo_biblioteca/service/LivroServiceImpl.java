package br.com.zup.dinamica_em_grupo_biblioteca.service;

import br.com.zup.dinamica_em_grupo_biblioteca.model.LivroEntity;
import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService{

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public List<LivroEntity> listarTodosLivros() {
        List<LivroEntity> livro = livroRepository.findAll();
        return livro;
    }


}
