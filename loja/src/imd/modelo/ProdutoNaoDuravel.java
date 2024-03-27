package imd.modelo;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ProdutoNaoDuravel extends Produto {
	private Date dataValidade;
	private String genero;
	
	//gets sets
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
