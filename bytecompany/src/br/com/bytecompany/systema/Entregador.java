package br.com.bytecompany.systema;

public class Entregador extends Funcionario {
	public Entregador(String nome, String nasc, String cpf, double salario) {
		super.nomeCompleto = nome;
		super.dataNascimento = nasc;
		super.cpf = cpf;
		super.salario = salario;
		super.cargo = "Entregador";
		System.out.println(super.cargo + ": " + nome + " Cadastrado Com Sucesso");
	}
}
