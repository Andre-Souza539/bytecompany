package br.com.bytecompany.systema;

public class TecnicoInformatica extends Funcionario{

	public TecnicoInformatica(String nome, String nasc, String cpf, double salario) {
		super.nomeCompleto = nome;
		super.dataNascimento = nasc;
		super.cpf = cpf;
		super.salario = salario;
		super.cargo = "T�cnico de Inform�tica";
		System.out.println(super.cargo + ": " + nome + " Cadastrado Com Sucesso");
	}
}

