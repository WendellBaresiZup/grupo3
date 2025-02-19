package br.com.zup.dinamica_em_grupo_biblioteca.controllers;


import br.com.zup.dinamica_em_grupo_biblioteca.model.LivroEntity;
import br.com.zup.dinamica_em_grupo_biblioteca.service.LivroService;
import br.com.zup.dinamica_em_grupo_biblioteca.service.LivroServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {
	private final LivroService service;

	public LivroController(LivroService service) {
		this.service = service;
	}

	@PutMapping("/{id}")
	public ResponseEntity<LivroEntity> updateLivro(@PathVariable Long id, @RequestBody LivroEntity livro) {
		service.updateLivro(id, livro.isDisponivel());
		return ResponseEntity.status(HttpStatus.OK).body(livro);
	}

}
