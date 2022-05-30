package br.com.bytecompany.systema;

public class Empresa {
	private String nome;
	private String cnpj;
	
	public Empresa() {
		this.nome = "ByteCompany";
		this.cnpj = "41.402.761/0001-57";
		System.out.println("Empresa Inicializada!\n");
	}
	
	public void pegarInformacoes() {
		System.out.println("\n========= Dados da Empresa =========");
		System.out.println("Nome: " + nome);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("=================###=================\n");
	}
	
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	
}
