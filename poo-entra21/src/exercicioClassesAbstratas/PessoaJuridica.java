package exercicioClassesAbstratas;

public class PessoaJuridica extends Pessoa {
	
	//Atributos
	private String cnpj;

	//Construtores
	public PessoaJuridica() {
	}

	//Método abstrato
	public boolean isAdimplente() {
		double sum = this.somaDosSaldos();
		if (sum > -1500)
		{
			this.setAdimplente(true);
			return true;
		}
		else
		{
			this.setAdimplente(false);
			return false;
		}
	}

	//Getters and Setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	

}
