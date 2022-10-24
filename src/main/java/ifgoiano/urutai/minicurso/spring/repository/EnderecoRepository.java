package ifgoiano.urutai.minicurso.spring.repository;

import ifgoiano.urutai.minicurso.spring.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query("from Endereco e where e.pessoa.id = :idPessoa")
    List<Endereco> findByIdPessoa(Long idPessoa);

}
