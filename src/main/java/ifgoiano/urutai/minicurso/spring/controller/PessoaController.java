package ifgoiano.urutai.minicurso.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ifgoiano.urutai.minicurso.spring.model.Pessoa;
import ifgoiano.urutai.minicurso.spring.service.PessoaService;

import javax.validation.Valid;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoa save(@RequestBody @Valid Pessoa pessoa) {
		return pessoaService.save(pessoa);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Pessoa update(@RequestBody @Valid Pessoa pessoa) {
		return pessoaService.save(pessoa);
	}
	
	@GetMapping
	public List<Pessoa> findAll() {
		return pessoaService.findAll();
	}

	@GetMapping("/{id}")
	public Pessoa findById(@PathVariable Long id){
		return pessoaService.findById(id);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteById(@PathVariable Long id){
		pessoaService.delete(id);
	}

	
}
