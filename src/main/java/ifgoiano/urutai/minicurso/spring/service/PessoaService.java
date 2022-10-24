package ifgoiano.urutai.minicurso.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ifgoiano.urutai.minicurso.spring.model.Pessoa;
import ifgoiano.urutai.minicurso.spring.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public Pessoa findById(Long id){
		return pessoaRepository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		pessoaRepository.deleteById(id);
	}
	
}
