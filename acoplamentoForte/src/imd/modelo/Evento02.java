package imd.modelo;

import java.util.Date;

public class Evento02 {
	//atributos
	private String nome;
	private Date data;
		
	public void agendar(String nome, Date dt) {
		this.nome = nome;
		this.data = dt;
	}

	public String getNome() {
		return nome;
	}

	public Date getData() {
		return data;
	}

}
