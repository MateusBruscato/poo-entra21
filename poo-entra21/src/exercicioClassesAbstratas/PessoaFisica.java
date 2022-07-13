package exercicioClassesAbstratas;

public class PessoaFisica extends Pessoa {


	//Atributos
	private String cpf;
	private String dataNascimento;
	private char sexo;
	
	public PessoaFisica() {
		super();
	}

	//Método Calcular idade
	

	//Método abstrato
	public boolean isAdimplente() {
		double sum = this.somaDosSaldos();
		if (sum > -500)
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

	//Getters and setters
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
