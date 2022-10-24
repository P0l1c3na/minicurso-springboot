package ifgoiano.urutai.minicurso.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifgoiano.urutai.minicurso.spring.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Long>{

}
