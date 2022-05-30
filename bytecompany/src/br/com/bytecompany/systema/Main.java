package br.com.bytecompany.systema;

public class Main {
	public static void main(String[] args) {
		Mensagens.Inicializacao();
		
//		Instancia o Objeto Empresa
		
		Empresa empresa = new Empresa();
		empresa.pegarInformacoes();
		
		Mensagens.dadosCarregados('e');

//		Instancia os Objetos Funcionarios; 
		
		Funcionario g1 = new Gerente("Eduardo Silva", "20/03/1992", "123.123.123-12", 5000);
		Funcionario ti1 = new TecnicoInformatica("Manuel Ricardo", "20/03/1992", "123.123.123-12", 3200);
		Funcionario v1 = new Vendedor("Julia Vasconselos", "21/04/1999", "123.123.123-12", 1900);
		Funcionario e1 = new Entregador("Flavio Jose", "21/04/1980", "123.123.123-12", 1600);
		
		g1.pegarInformacoes();
		ti1.pegarInformacoes();
		v1.pegarInformacoes();
		e1.pegarInformacoes();
		
		Mensagens.dadosCarregados('f');
		
//		Instancia os Objetos Clientes
			
		Cliente c1 = new Cliente("André Souza", "123.123.123-12", "Rua Epaminondas, N: 66", "27/05/1999","+55 81 9 8254-5572");
		Cliente c2 = new Cliente("Vitoria Rocha", "123.123.123-12", "Rua Coral, N: 45", "16/05/2000","+55 81 9 8254-5572");
		Cliente c3 = new Cliente("Lucas Silveira", "123.123.123-12", "Rua Amargedon, N: 145", "04/12/1998","+55 81 9 8254-5572");
		Cliente c4 = new Cliente("Gabi Souza", "123.123.123-12", "Rua Alberto Terceir, N: 24", "15/06/1999","+55 81 9 8254-5572");
		Cliente c5 = new Cliente("Maria Eduarda", "123.123.123-12", "Rua Tabaiares, N: 233D", "06/05/2004","+55 81 9 8254-5572");
		
		c1.pegarInformacoes();
		c2.pegarInformacoes();
		c3.pegarInformacoes();
		c4.pegarInformacoes();
		c5.pegarInformacoes();	
		
		Mensagens.dadosCarregados('c');
		
// 		Instancia os Objetos Produtos;
		
		Produto p1 = new Produto("223DEF041", 45, 1.5, 1000, "Preto",150);
		Produto p2 = new Produto("3DUD45541", 22, 1.8, 1900, "Roxo",129.90);
		Produto p3 = new Produto("3JULK5541", 32, 1.3, 3500, "Azul",147.85);
		Produto p4 = new Produto("K1LLWR212", 61, 1.6, 5000, "Cinza",69.9);
		Produto p5 = new Produto("456LOL123", 12, 1.8, 1100, "Rosa", 500);
		
		p1.pegarInformacoes();
		p2.pegarInformacoes();
		p3.pegarInformacoes();
		p4.pegarInformacoes();
		p5.pegarInformacoes();
		
		Mensagens.dadosCarregados('p');
		
		Venda venda1 = new Venda(c1, p3, empresa, v1);

		
		
		
		
	}
}
