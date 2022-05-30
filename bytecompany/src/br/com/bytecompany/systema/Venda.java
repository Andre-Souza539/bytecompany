package br.com.bytecompany.systema;

public class Venda {
	private String nomeCliente;
	private String cpfCliente;
	private double valorProduto;
	private String nomeEmpresa;
	private String cnpjEmpresa;
	private String nomeVendedor;
	private int quantidadeProduto;
	static int COUNTER = 1;
	
	
	public Venda(Cliente c, Produto p, int qtd, Empresa e, Vendedor v1) {
		this.nomeCliente = c.getNome();
		this.cpfCliente = c.getCpf();
		this.valorProduto = p.getPreco();
		this.quantidadeProduto = qtd;
		this.nomeEmpresa = e.getNome();
		this.cnpjEmpresa = e.getCnpj();
		this.nomeVendedor = v1.getNome();
		System.out.println("Venda ID: " + COUNTER++ +" Cadastrada com sucesso!");
			
	}	
	
	public void pegarInformacoes() {
		System.out.println("\n========= Dados da Venda =========");
		System.out.println("Nome Empresa: " + empresa);
		System.out.println("CNPJ Empresa: " + Empresa.getCnpj());
		System.out.println("Nome Cliente: " + cpf);
		System.out.println("CPF: " + cpf);
		System.out.println("ID da compra: " + salario);
		System.out.println("Valor da Compra: " + cargo);
		System.out.println("=================###=================");
	}
	
	
}
