package br.com.zup.dinamica_em_grupo_biblioteca.service;

import br.com.zup.dinamica_em_grupo_biblioteca.exceptions.LivroNotFound;
import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroServiceImpl implements LivroService{
    @Autowired
    public LivroRepository livroRepository;

    @Override
    public void deleteLivro(Long id) {
        if(livroRepository.existsById(id)){
            livroRepository.deleteById(id);
        } else {
            throw new LivroNotFound("O livro com id:" + id + "não foi encontrado para deleção.");
        }
    }
}
