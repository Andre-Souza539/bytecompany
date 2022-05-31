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
	
	
	public Venda(Cliente c, Produto p, int qtd, Empresa e, Funcionario v1) {
		this.nomeCliente = c.getNome();
		this.cpfCliente = c.getCpf();
		this.valorProduto = p.getPreco();
		this.quantidadeProduto = qtd;
		this.nomeEmpresa = e.getNome();
		this.cnpjEmpresa = e.getCnpj();
		this.nomeVendedor = v1.getNomeCompleto();
		System.out.println("Venda ID: " + COUNTER++ +" Cadastrada com sucesso!");
			
	}	
	
	public void pegarInformacoes() {
		System.out.println("\n========= Dados da Venda =========");
		System.out.println("ID da compra: " + (COUNTER - 1));
		System.out.println("Nome Empresa:" + nomeEmpresa);
		System.out.println("CNPJ Empresa:" + cnpjEmpresa);
		System.out.println("Nome Cliente:" + nomeCliente);
		System.out.println("CPF do Cliente:" + cpfCliente);
		System.out.println("Nome do Vendedor:" + nomeVendedor);
		System.out.println("Valor da Compra: R$" + quantidadeProduto * valorProduto);
		System.out.println("=================###=================");
	}
}
