package br.com.zup.dinamica_em_grupo_biblioteca.repositories;



import br.com.zup.dinamica_em_grupo_biblioteca.model.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}
