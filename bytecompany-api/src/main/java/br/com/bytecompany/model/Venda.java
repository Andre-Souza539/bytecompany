package br.com.bytecompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeEmpresa;
	private String cnpjEmpresa;
	private String nomeVendedor;
	private String nomeCliente;
	private String cpfCliente;
	
	private int qtdProduto;
	private double precoProduto;
	private double valorTotal = qtdProduto * precoProduto;
	
}
