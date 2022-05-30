package br.com.bytecompany.systema;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	private String dataNascimento;
	private String telefone;
	private double credito;
	private int id;
	
	private static int COUNTER = 1;
	
	public Cliente(String nome, String cpf, String endereco, String dataNascimento, String telefone){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.credito = 0;
		this.id = COUNTER++;
		this.telefone = telefone;
		System.out.println("Cliente: " + nome + " Cadastrado Com Sucesso!");
	}
	
	
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


	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getIdade() {
		return idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public double getCredito() {
		return credito;
	}
	
	
}
