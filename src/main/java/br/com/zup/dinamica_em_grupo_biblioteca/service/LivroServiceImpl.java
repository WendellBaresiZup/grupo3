package br.com.zup.dinamica_em_grupo_biblioteca.service;

import br.com.zup.dinamica_em_grupo_biblioteca.model.LivroEntity;
import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import br.com.zup.dinamica_em_grupo_biblioteca.exceptions.LivroNotFound;
import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Override
    public void deleteLivro(Long id) {
        if(livroRepository.existsById(id)){
            livroRepository.deleteById(id);
        } else {
            throw new LivroNotFound("O livro com id:" + id + "não foi encontrado para deleção.");
        }
    }
}
