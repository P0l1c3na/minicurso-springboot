package ifgoiano.urutai.minicurso.spring.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "O nome deve ser informado")
	@Size(message = "O nome deve ter entre 2 e 64 caracteres", min = 2, max = 64)
	private String nome;

	@CPF(message = "O CPF está em formato Inválido")
	@NotBlank(message = "O CPF deve ser informado")
	private String cpf;

	@Email(message = "O email está em formato inválido")
	@NotBlank(message = "O Email deve ser Informnado")
	private String email;

	@NotNull(message = "A data de Nascimento deve ser informada")
	private LocalDate dataDeNascimento;

	@Size(max = 32, min = 3, message = "A profissão deve ter entre 3 e 32 caracteres")
	@NotBlank(message = "A profissão deve ser informada")
	private String profissao;

	@Size(max = 16, min = 4, message = "A Cor deve ter entre 4 e 16 caracteres")
	@NotBlank(message = "A cor deve ser informada")
	private String cor;

	@OneToMany(mappedBy = "pessoa",
			cascade = CascadeType.DETACH,
			orphanRemoval = true,
			targetEntity = Endereco.class,
			fetch = FetchType.EAGER)
	private List<Endereco> enderecos;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Pessoa pessoa = (Pessoa) o;
		return id != null && Objects.equals(id, pessoa.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
