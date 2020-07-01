package com.paz.solutions.domain.model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.*;

@Entity
@Table(schema = "public", name = "cliente")
@SequenceGenerator(name = "cliente", sequenceName = "cliente_id_seq", schema = "public")
public class Cliente {
	
	@Id
    @GeneratedValue(generator = "cliente")
	private Long id;
	private String nome;
	private String ddd;
	private String telefone;
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
