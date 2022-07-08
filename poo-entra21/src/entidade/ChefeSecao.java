package entidade;

public class ChefeSecao extends Funcionario {
	
	private String secao;
	private double adicional;
	
	public ChefeSecao(String nome, double salario, int idade, String cpf, String dataAdmissao, String secao, double adicional) {
		super(nome, salario, idade, cpf, dataAdmissao);
		this.secao = secao;
		this.adicional = adicional;
	}
	
	@Override
	public double getSalarioLiquido() {
		return super.getSalarioLiquido() + this.adicional;
	}

	@Override
	public double getSalario() {
		return super.getSalario();
	}



	public void main(String[] args) {

	}

}
