package br.com.bytecompany.systema;

public class Vendedor extends Funcionario{
	public Vendedor(String nome, String nasc, String cpf, double salario) {
		super.nomeCompleto = nome;
		super.dataNascimento = nasc;
		super.cpf = cpf;
		super.salario = salario;
		super.cargo = "Vendedor";
		System.out.println(super.cargo + ": " + nome + " Cadastrado Com Sucesso");
	}

	public String getNome() {
		return nomeCompleto;
	}

}
