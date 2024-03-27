package imd.modelo;

public class MaquinaDeRefrigerante {
	//Atributos
	private int preco;
	private int balanco;
	private int total;
	private boolean darTroco;
	
	//Metodo construtor para inicializar os atributos
	public MaquinaDeRefrigerante(int valor) {
		preco = valor;
		balanco = 0;
		total = 0;
		darTroco = false;
	}
	
	// Setar darTroco
	public void setDarTroco(){
		darTroco = true;
	}

	//Retorna o preco
	public int getPreco() {
		return preco;
	}
	//Retorna o balanco corrente
	public int getBalanco() {
		return balanco;
	}
	
	//Recebe um valor em dinheiro
	public void inserirDinheiro(int valor) {
		if(valor > 0) {
		balanco += valor;
		System.out.println("Valor inserido com sucesso!!!");
		}
		else {
			System.out.println("Use um valor positivo!!!");
			System.out.println("tente outra vez!");
		}
	}
	
	//Imprimir o preco do refrigerante
	public void imprimirPreco() {
		System.out.println("#################");
		System.out.println("# Preco #########");
		System.out.println("# Refrigerante");
		System.out.println("# R$ " + preco);
		System.out.println("#################");
	}
	
	//Comprar um Refrigerante
	public void comprarRefrigerante() {
		if(balanco >= preco) {
			System.out.println("#################");
			System.out.println("# Recibo #########");
			System.out.println("# Refrigerante");
			System.out.println("# R$ " + preco + ",00");
			System.out.println("#################");
			System.out.println();
			
			//Atualizar montante total de vendas da maquina
			total = total + preco;
			
			//Atualizar o montando do cliente
			balanco = balanco - preco;
			if(balanco > 0 && darTroco == true) {
				System.out.println("#################");
				System.out.println("# troco ##");
				System.out.println("# Refrigerante");
				System.out.println("# R$ " + devolverTroco() + ",00");
				System.out.println("#################");
				System.out.println();
			}
		}
		else {
			System.out.println("voce precisa inserir pelo menos: R$ " +
								(preco - balanco) + ",00");
		}
	}
	
	//Devolver troco
	public int devolverTroco() {
		int valorParaDevolver;
		valorParaDevolver = balanco;
		balanco = 0;
		darTroco = false;
		return valorParaDevolver;
	}

	
}
