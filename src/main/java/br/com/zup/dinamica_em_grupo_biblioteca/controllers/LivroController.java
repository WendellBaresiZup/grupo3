package br.com.zup.dinamica_em_grupo_biblioteca.controllers;


import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import br.com.zup.dinamica_em_grupo_biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delateLivro(@PathVariable Long id) {
        livroService.deleteLivro(id);
        return ResponseEntity.noContent().build();
    }
}
