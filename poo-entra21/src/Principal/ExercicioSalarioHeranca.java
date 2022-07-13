package Principal;

import exercicioSalarios.ChefeSecao;
import exercicioSalarios.Diretor;
import exercicioSalarios.Funcionario;
import exercicioSalarios.Gerente;

public class ExercicioSalarioHeranca {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[10];
				
		Funcionario pedro = new Funcionario("Pedro", 2500, "2010");
		Funcionario victor = new Funcionario("Victor", 2500, "2010");
		Funcionario maria = new Funcionario("Maria", 2500, "2010");
		
		Funcionario jose = new Gerente("Jos�", 4000, "2007", 520d);
		
		Funcionario zacarias = new ChefeSecao("Zacarias", 2500, "2010", 300);
		Funcionario tatiani = new ChefeSecao("Tatiani", 2500, "2010", 300);
		
		Funcionario sabrina = new Diretor("Sabrina", 12000, "2007", 5); // 5% de gratifica��o
		
		funcionarios[0] = pedro;
		funcionarios[1] = victor;
		funcionarios[2] = maria;
		funcionarios[3] = jose;
		funcionarios[4] = zacarias;
		funcionarios[5] = tatiani;
		funcionarios[6] = sabrina;

		double totalFolha = 0;
		
		for (int i = 0; i < funcionarios.length; i++) {
			Funcionario funcionarioAtual = funcionarios[i];
			if(funcionarioAtual != null) {
				System.out.println("Funcion�rio atual: " + funcionarioAtual.getNome() + ". Sal�rio: " + funcionarioAtual.getSalarioLiquido());
				totalFolha += funcionarioAtual.getSalarioLiquido();
			}
		}
		
		System.out.println("Total da folha: " + totalFolha);
	}

}
