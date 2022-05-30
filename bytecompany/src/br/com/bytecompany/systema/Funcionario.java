package br.com.bytecompany.systema;

public abstract class Funcionario {
	protected String nomeCompleto; 
	protected String dataNascimento;
	protected String cpf;
	protected String cargo;
	protected String empresa;
	protected double salario;	

	
	public void pegarInformacoes() {
		System.out.println("\n========= Dados do Funcionario =========");
		System.out.println("Nome: " + nomeCompleto);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("CPF: " + cpf);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$" + salario);
		System.out.println("=================###=================");
	}
}
