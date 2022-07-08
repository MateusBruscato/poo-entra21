package entidade;

public class Diretor extends Funcionario{
	
	private double gratificacao;
	

	public Diretor(String nome, double salario, int idade, String cpf, String dataAdmissao, double gratificacao) {
		super(nome, salario, idade, cpf, dataAdmissao);
		this.gratificacao = gratificacao;
	}


	@Override
	public double getSalarioLiquido() {
		// TODO Auto-generated method stub
		return super.getSalarioLiquido() + this.calcularComissao();
	}

	private double calcularComissao() {
		return this.getSalario() * (1 + (this.gratificacao/100) * Math.floor((2022 - Integer.valueOf(this.getDataAdmissao())) / 3)); 
	}

	public double getSalario() {
		return super.getSalario();
	}


	

}
