package imd.visao;


import imd.modelo.*;

public class LojaView {
	public static void main(String args[]) {
		
		ProdutoDuravel nint3ds = new ProdutoDuravel();
		ProdutoDuravel nintswich = new ProdutoDuravel();
		ProdutoDuravel nint64 = new ProdutoDuravel();
		
		ProdutoNaoDuravel cafeComCanela = new ProdutoNaoDuravel();
		ProdutoNaoDuravel cafeComChocolate = new ProdutoNaoDuravel();
		ProdutoNaoDuravel cafeComLeite = new ProdutoNaoDuravel();
		
		nint3ds.setNome("nintendo 3ds");
		nint3ds.setMarca("nintendo");
		nint3ds.setDescricao("tem uns rpgs fodas");
		nint3ds.setDurabilidade(100000);
		nint3ds.setPreco(650);
		
		nintswich.setNome("nintendo Switch");
		nintswich.setMarca("nintendo");
		nintswich.setDescricao("tem uns Zeldas fodas");
		nintswich.setDurabilidade(100000);
		nintswich.setPreco(2000);
		
		nint64.setNome("nintendo 64");
		nint64.setMarca("nintendo");
		nint64.setDescricao("tem uns Marios fodas");
		nint64.setDurabilidade(5000);
		nint64.setPreco(500);
		
		
		cafeComCanela.setNome("cafe com canela");
		cafeComCanela.setMarca("melhorCafeQueTem");
		cafeComCanela.setDescricao("muito boa a canela");
		cafeComCanela.setGenero("Comida");
		cafeComCanela.setPreco(3);
		//cafeComCanela.setDataValidade("10/05/2025");
		
		cafeComChocolate.setNome("cafe com chocolate");
		cafeComChocolate.setMarca("melhorCafeQueTem");
		cafeComChocolate.setDescricao("muito bom o cafe");
		cafeComChocolate.setGenero("Comida");
		cafeComChocolate.setPreco(6);
		
		cafeComLeite.setNome("cafe com Leite");
		cafeComLeite.setMarca("melhorCafeQueTem");
		cafeComLeite.setDescricao("muito bom o leite");
		cafeComLeite.setGenero("Comida");
		cafeComLeite.setPreco(2);
		
		Deposito deposito = new Deposito();
		
		deposito.adicionaProduto(nint64);
		deposito.adicionaProduto(nintswich);
		deposito.adicionaProduto(nint3ds);
		deposito.adicionaProduto(cafeComLeite);
		deposito.adicionaProduto(cafeComChocolate);
		deposito.adicionaProduto(cafeComCanela);
		
		deposito.infoQuant();
		
		deposito.infoSeVazio();
		
		deposito.produtoMaisCaro();
		
		deposito.removeProduto(4);
		deposito.removeProduto(1);
		
		deposito.infoQuant();
		
		
	}
}
