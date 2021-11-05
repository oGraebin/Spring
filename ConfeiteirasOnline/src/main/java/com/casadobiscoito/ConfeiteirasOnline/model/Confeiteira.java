package com.casadobiscoito.ConfeiteirasOnline.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_confeiteira")
public class Confeiteira {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 3, max = 50)
	private String nome;
	
	
	@Size(min = 0, max = 100)
	private String descricaopessoal;
	
	@NotBlank
	private String cidade;
	
	@OneToMany(mappedBy = "confeiteira", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("confeiteira")
	private List<Produtos> produtos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaopessoal() {
		return descricaopessoal;
	}

	public void setDescricaopessoal(String descricaopessoal) {
		this.descricaopessoal = descricaopessoal;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
