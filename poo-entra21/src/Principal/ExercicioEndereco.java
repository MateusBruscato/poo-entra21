package Principal;

import exercicioSalarios.Funcionario;

public class ExercicioEndereco {

	public static void main(String[] args) {
		
		//O Objeto endereço já é criado na classe Funcionário
		Funcionario mateus = new Funcionario("Mateus", 1500d, "2006");
		mateus.getEndereco().setBairro("Trindade");
		mateus.getEndereco().setLogradouro("Rua dos Limoeiros");
		mateus.getEndereco().setNumero("186-B");
		mateus.getEndereco().setCidade("Florianópolis");
		
		System.out.println(mateus.getEndereco().toString());
	}

}
