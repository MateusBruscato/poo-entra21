package Principal;

import exercicioSalarios.Funcionario;

public class ExercicioEndereco {

	public static void main(String[] args) {
		
		//O Objeto endere�o j� � criado na classe Funcion�rio
		Funcionario mateus = new Funcionario("Mateus", 1500d, "2006");
		mateus.getEndereco().setBairro("Trindade");
		mateus.getEndereco().setLogradouro("Rua dos Limoeiros");
		mateus.getEndereco().setNumero("186-B");
		mateus.getEndereco().setCidade("Florian�polis");
		
		System.out.println(mateus.getEndereco().toString());
	}

}
