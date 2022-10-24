package ifgoiano.urutai.minicurso.spring.controller;

import ifgoiano.urutai.minicurso.spring.model.Endereco;
import ifgoiano.urutai.minicurso.spring.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/endereco")
@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public Endereco save(@RequestBody @Valid Endereco endereco){
        return enderecoService.save(endereco);
    }

    @PutMapping
    public Endereco update(@RequestBody @Valid Endereco endereco){
        return enderecoService.save(endereco);
    }

    @GetMapping
    public List<Endereco> findAll() {
        return enderecoService.findAll();
    }

    @GetMapping("/{id}")
    public Endereco findById(@PathVariable Long id) {
        return enderecoService.findById(id);
    }

    @GetMapping("/{idPessoa}")
    public List<Endereco> findByIdPessoa(@PathVariable Long idPessoa) {
        return enderecoService.findByIdPessoa(idPessoa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        enderecoService.deleteById(id);
    }
}
