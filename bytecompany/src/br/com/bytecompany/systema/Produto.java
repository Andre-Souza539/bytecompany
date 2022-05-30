package br.com.bytecompany.systema;

public class Produto {
	private String sku;
	private double volume;
	private double peso;
	private int estoque;
	private String cor;
	private double preco;

	public Produto(String sku, double volume, double peso, int estoque, String cor, double preco) {
		
		this.sku = sku;
		this.volume = volume;
		this.peso = peso;
		this.estoque = estoque;
		this.cor = cor;
		this.preco = preco;
		

		
		
		System.out.println("Produto SKU: " + sku + " Cadastrado com Sucesso!");
		
	}
	
	public void pegarInformacoes() {
		System.out.println("\n========= Dados do Produto =========");
		System.out.println("Sku: " + sku);
		System.out.println("Volume: " + volume +"cm³");
		System.out.println("Peso: " + peso +"kg");
		System.out.println("Preço: R$" + preco);
		System.out.println("Quantidade em Estoque: " + estoque);
		System.out.println("=================###=================");
	}

	public double getPreco() {
		return this.preco;
	}
}
