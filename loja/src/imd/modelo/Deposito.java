package imd.modelo;
import java.util.ArrayList;

public class Deposito {
	private ArrayList<Produto> armazem;
	
	public Deposito(){
		armazem = new ArrayList<Produto>();
	}
	
	public void adicionaProduto(Produto produto) {
		armazem.add(produto);
		System.out.println("produto adicionado!!");
	}
	
	public void removeProduto(int num) {
		armazem.remove(num);
		System.out.println("produto removido!!");
	}
	
	public void infoQuant() {
		System.out.println("existem: " + armazem.size() + " Produtos");
	}
	
	public void infoSeVazio() {
		if(armazem.isEmpty() == true) {
			System.out.println("esta vazio");
		}
		else {
			System.out.println("nao esta vazio");
		}
	}
	
	public void produtoMaisCaro() {
		double valor = 0;
		String produtoMaiorPreco = "";
		for (Produto p : armazem) {
			if(p.getPreco() >= valor) {
				valor = p.getPreco();
				produtoMaiorPreco = p.getNome();
			}
		}
		System.out.println("o produto mais caro e o(a)" + produtoMaiorPreco);
	}
}
