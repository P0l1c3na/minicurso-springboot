package ifgoiano.urutai.minicurso.spring.service;

import ifgoiano.urutai.minicurso.spring.model.Endereco;
import ifgoiano.urutai.minicurso.spring.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Endereco findById(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        enderecoRepository.deleteById(id);
    }

    public List<Endereco> findByIdPessoa(Long idPessoa) {
        return enderecoRepository.findByIdPessoa(idPessoa);
    }

}
