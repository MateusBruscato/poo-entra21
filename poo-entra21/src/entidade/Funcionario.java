package entidade;

public class Funcionario {

	private String nome;
	private double salario;
	private int idade;
	private String cpf;
	private String dataAdmissao;
	
	public Funcionario(String nome, double salario, int idade, String cpf, String dataAdmissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalarioLiquido() {
		return this.getSalario() - this.calcularDesconto();
	}
	
	private double calcularDesconto() {
		return this.getSalario() * 0.06;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}	

}
