package imd.modelo;

public class Evento {
	
	//atributos
	private String nome;
	private int dia, mes, ano;
	
	public void agendar(String nome, int dia, int mes, int ano) {
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

}
