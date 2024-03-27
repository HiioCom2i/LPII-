package acoplamentoFraco.visao;
import acoplamentoFraco.modelo.*;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class EsclaVisaoMelhorada {

		public static void main(String[] args[]) throws ParseException {
			EscolaMelhorada escola = new EscolaMelhorada();
			EventoMelhorado evento = new EventoMelhorado();
			
			Scanner ler = new Scanner(System.in);
			
			String descricao = "";
			String data = "00-00-0000";
			
			System.out.printf("informe a descrição do evento:\n");
			descricao = ler.next();
			System.out.printf("informe a data do evento:\n");
			data = ler.next();
			
			Date dt = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
			dt = formato.parse(data);
			
			evento.setDescricao(descricao);
			evento.setData(dt);
			
			escola.setEvento(evento);
			mostrarEvento(escola);
			
		}
		
		public static void mostrarEvento(EscolaMelhorada escola) {
			System.out.println("\n");
			System.out.println("Evento: " + escola.getEvento().getDescricao());
			System.out.println("Data: " + escola.getEvento().getData());
		}
}
