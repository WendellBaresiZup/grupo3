package br.com.zup.dinamica_em_grupo_biblioteca.service;

import br.com.zup.dinamica_em_grupo_biblioteca.model.LivroEntity;
import br.com.zup.dinamica_em_grupo_biblioteca.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroServiceImpl implements LivroService {
	private final LivroRepository repository;

	public LivroServiceImpl(LivroRepository repository) {
		this.repository = repository;
	}

	@Override
	public void updateLivro(Long id, boolean status) {
		Optional<LivroEntity> livroOptional = repository.findById();

		if (livroOptional.isPresent()) {
			LivroEntity livro = livroOptional.get();

			if (livro.isDisponivel() != status) {
				livro.setDisponivel(status);
			}

		}

		throw new RuntimeException("Livro não encontrado");

	}

}
