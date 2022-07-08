package entidade;

public class Gerente extends Funcionario {
	
	private double comissao;
	

	public Gerente(String nome, double salario, int idade, String cpf, String dataAdmissao, double comissao) {
		super(nome, salario, idade, cpf, dataAdmissao);
		this.comissao = comissao;
	}

	@Override
	public double getSalarioLiquido() {
		return super.getSalarioLiquido() + this.comissao;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	
}
