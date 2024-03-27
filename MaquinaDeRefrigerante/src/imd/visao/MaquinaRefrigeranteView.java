package imd.visao;
import imd.modelo.*;

public class MaquinaRefrigeranteView {
	//Criando o metodo executavel da classe
	public static void main(String args[]) {
		
		//Instanciando a classe -- criando objeto
		MaquinaDeRefrigerante maquina = new MaquinaDeRefrigerante(5);
		
		//chamando um metodo
		maquina.imprimirPreco();
		
		//inserir dinheiro na maquina
		System.out.println("");
		maquina.inserirDinheiro(15);
		
		//retornando o balanco corrente
		System.out.println("");
		System.out.println("Balanco atual =>" + maquina.getBalanco());
		
		//comprar na maquina
		maquina.comprarRefrigerante();
		
		maquina.setDarTroco();
		
		//Comprar na maquina
		maquina.comprarRefrigerante();
		
		//inserir dinheiro na maquina
		maquina.inserirDinheiro(10);
		
		//Comprar na maquina
		maquina.comprarRefrigerante();
		
		////Comprar na maquina
		maquina.comprarRefrigerante();
		
	}
	
}
