package br.com.bytecompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	protected String nomeCompleto; 
	protected String dataNascimento;
	protected String cpf;
	protected String cargo;
	protected String empresa;
	protected double salario;	
	
}
