package imd.visao;
import imd.modelo.*;
import java.util.Scanner;

public class PessoaView {
	public static void main(String args[]) {
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Digite o peso: ");
		Scanner input01 = new Scanner(System.in);
		double peso = input01.nextDouble();
		pessoa.setPeso(peso);
		
		System.out.print("Digite a altura: ");
		Scanner input02 = new Scanner(System.in);
		double altura = input02.nextDouble();
		pessoa.setAltura(altura);
		
		pessoa.calculaIMC();
		System.out.println("Peso => " + String.format("%.2f", pessoa.getPeso()));
		System.out.println("Altura => " + String.format("%.2f", pessoa.getAltura()));
		System.out.println("IMC =>" + String.format("%.2f", pessoa.getIMC()));
		System.out.println(pessoa.informarIMC());
	}	
}