package br.com.bytecompany.systema;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, String nasc, String cpf, double salario) {
		super.nomeCompleto = nome;
		super.dataNascimento = nasc;
		super.cpf = cpf;
		super.salario = salario;
		super.cargo = "Gerente";
		System.out.println(super.cargo + ": " + nome + " Cadastrado Com Sucesso");
	}
}
