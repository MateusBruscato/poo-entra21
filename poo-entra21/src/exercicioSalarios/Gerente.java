package exercicioSalarios;

public class Gerente extends Funcionario {
	
	private double comissao;
	

	public Gerente(String nome, double salario, String dataAdmissao, double comissao) {
		super(nome, salario, dataAdmissao);
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
