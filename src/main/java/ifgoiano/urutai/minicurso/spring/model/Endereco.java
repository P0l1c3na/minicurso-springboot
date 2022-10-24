package ifgoiano.urutai.minicurso.spring.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "A Pessoa deve ser informada")
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private Pessoa pessoa;

    @Size(max = 9, min = 9, message = "O CEP deve ter 9 caracteres no formato XXXXX-XXX")
    @NotBlank(message = "O CEP deve ser informado")
    private String cep;

    @NotBlank(message = "A Rua deve ser informada")
    @Size(min = 2, max = 128, message = "A rua deve ter entre 2 e 128 caracteres")
    private String rua;

    @NotBlank(message = "O Bairro Deve ser informado")
    @Size(min = 2, max = 128, message = "O Bairro deve ter entre 2 e 128 caracteres")
    private String bairro;

    @Size(max = 100000, message = "O numero deve ter o valor de até 100.000")
    private Integer numero;

    @NotBlank(message = "A cidade deve ser informada")
    @Size(min = 2, max = 128, message = "A Cidade deve ter entre 2 e 32 caracteres")
    private String cidade;

    @NotBlank(message = "O Estado deve ser informado")
    @Size(min = 2, max = 128, message = "O Estado deve ter entre 2 e 32 caracteres")
    private String estado;

    @NotBlank(message = "O País deve ser informado")
    @Size(min = 2, max = 128, message = "O País deve ter entre 2 e 32 caracteres")
    private String pais;

    @Size(max = 256, message = "O complemento deve ter até 256 caracteres")
    private String complemento;
}
