package imd.modelo;

public class Pessoa {
	
	//Atributos
	private double peso;
	private double altura;
	private double IMC;
	
	//Construtor
	public Pessoa() {
		this.peso = 0;
		this.altura = 0;
		IMC = 0;
	}
	
	//gets e sets
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getIMC() {
		return IMC;
	}

	public double calculaIMC() {
		IMC = this.peso/(this.altura*this.altura);
		return IMC;
	}
	
	public String informarIMC() {
		String out = "";
		if(IMC < 18.5) {
			out = "abaixo do peso";
		}else {
			if(IMC >= 18.5 && IMC < 24.9) {
				out = "peso normal";
			}
			else {
				if(IMC >= 25 && IMC < 29.9) {
					out = "pre-obesidade";
				}
				else {
					if(IMC >= 30 && IMC < 34.9) {
						out = "obesidade grau 1";
					}
					else {
						if(IMC >= 35 && IMC < 39.9) {
							out = "obesidade grau 2";
						}
						else {
							if(IMC >= 40) {
								out = "obesidade grau 3";
							}
						}
					}
				}
			}
		}
		return out;
	}

}
