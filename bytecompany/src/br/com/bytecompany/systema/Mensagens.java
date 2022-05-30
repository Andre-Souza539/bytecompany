package br.com.bytecompany.systema;

public class Mensagens {
	
	
	public static void Inicializacao() {
		System.out.println("========= Iniciando o Sistema =========\n");
	}
	
	public static void dadosCarregados(char c) {
	
		switch (c) {
		case 'e': {
			System.out.println("\n========= Dados da Empresa Carregados =========\n");
			break;
		}
		case 'f': {
			System.out.println("\n========= Dados de Funcionarios Carregados =========\n");
			break;
		}
		case 'c': {
			System.out.println("\n========= Dados de Clientes Carregados =========\n");
			break;
		}
		case 'p': {
			System.out.println("\n========= Dados de Produtos Carregados =========\n");
			break;
		}
		default:
			throw new IllegalArgumentException("Valor Inesperado: " + c);
		}
	}
	
	
	
}
