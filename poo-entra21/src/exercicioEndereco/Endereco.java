package exercicioEndereco;

public class Endereco {

	String CEP;
	String logradouro;
	String numero;
	String bairro;
	String estado;
	String cidade;
	
	public Endereco(String CEP, String logradouro, String numero, String bairro, String estado, String cidade)
	{
		this.CEP = CEP;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
	}
	
	public Endereco() {
		super();
	}

	@Override
	public String toString() {
		
		return (this.logradouro + ", " + this.numero + ", " + this.bairro + ", " + this.cidade);
	}
	
	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
