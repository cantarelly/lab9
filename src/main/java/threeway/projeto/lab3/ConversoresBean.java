package threeway.projeto.lab3;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;


@ManagedBean(name="conversoresBean")
@ViewScoped
public class ConversoresBean implements Serializable {


	private static final long serialVersionUID = 4472208413748935821L;
	private Date dataNascimento;
	private Integer peso;
	private String celsiusToFahrenheitConverter;
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public String getCelsiusToFahrenheitConverter() {
		return celsiusToFahrenheitConverter;
	}
	public void setCelsiusToFahrenheitConverter(String celsiusToFahrenheitConverter) {
		this.celsiusToFahrenheitConverter = celsiusToFahrenheitConverter;
	}
	
	

}
