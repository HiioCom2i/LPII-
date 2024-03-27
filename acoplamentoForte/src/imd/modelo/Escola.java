package imd.modelo;
import java.util.Scanner;

public class Escola {
	Evento e = new Evento02();
	public void cadastrarEvento() {
		
		Scanner ler = new Scanner(System.in);
		String nome = "";
		int dia, mes, ano;
		
		System.out.printf("informe a descricao do evento:\n");
		nome = ler.next();	
		
		System.out.printf("informe o dia do evento:\n");
		dia = ler.nextInt();
		
		System.out.printf("informe o mes do evento:\n");
		mes = ler.nextInt();
		
		System.out.printf("informe o ano do evento:\n");
		ano = ler.nextInt();
		
		e.agendar(nome, dia, mes, ano);
	}
	
	public void mostrarEvento() {
		System.out.println("\n");
		System.out.println("Eentos: " + e.getNome());
		System.out.println("Data " + e.getDia() + "/" + e.getMes() + "/" + e.getAno());
		
	}
}
