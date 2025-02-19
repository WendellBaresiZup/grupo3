package br.com.zup.dinamica_em_grupo_biblioteca.controllers;


import br.com.zup.dinamica_em_grupo_biblioteca.model.LivroEntity;
import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import br.com.zup.dinamica_em_grupo_biblioteca.service.LivroService;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import br.com.zup.dinamica_em_grupo_biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroRepository livroRepository;
    private final LivroService livroService;

    public LivroController(LivroRepository livroRepository, LivroService livroService) {
        this.livroRepository = livroRepository;
        this.livroService = livroService;
    }

    @GetMapping
    public List<LivroEntity> listarTodos() {
        return livroRepository.findAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delateLivro(@PathVariable Long id) {
        livroService.deleteLivro(id);
        return ResponseEntity.noContent().build();
    }
}
