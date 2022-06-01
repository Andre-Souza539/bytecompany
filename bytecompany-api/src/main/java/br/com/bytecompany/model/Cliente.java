package br.com.bytecompany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	private String dataNascimento;
	private String telefone;
	private double credito;
	
	public void pegarInformacoes() {
		System.out.println("\n========= Dados do Cliente =========");
		System.out.println("Id: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("CPF: " + cpf);
		System.out.println("Endereço: " + endereco);
		System.out.println("Contato: " + telefone);
		System.out.println("Idade: " + idade);
		System.out.println("Crédito: R$" + credito);
		System.out.println("=================###=================");
	}
	
}
