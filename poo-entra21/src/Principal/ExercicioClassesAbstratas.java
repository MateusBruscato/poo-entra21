package Principal;

import java.util.ArrayList;

import exercicioClassesAbstratas.Conta;
import exercicioClassesAbstratas.Pessoa;
import exercicioClassesAbstratas.PessoaFisica;
import exercicioClassesAbstratas.PessoaJuridica;

public class ExercicioClassesAbstratas {

	public static void main(String[] args) {
		
		//Lista de pessoas
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		PessoaFisica mateus = new PessoaFisica();
		pessoas.add(mateus);
		PessoaJuridica Larissa = new PessoaJuridica();
		pessoas.add(Larissa);
		PessoaFisica victor = new PessoaFisica();
		pessoas.add(victor);
		
		//É possível eu criar esse arrayList dentro do contrutor de pessoas e deixar ele vazio?
		ArrayList<Conta> Contas = new ArrayList<Conta>();
		Contas.add(new Conta("001","0123", -300d));
		Contas.add(new Conta("002","0234", 1000d));
		Contas.add(new Conta("003","0234", -2000d));
		Contas.add(new Conta("004","0234", 400d));
		Contas.add(new Conta("005","0234", -300d));
		Contas.add(new Conta("006","0234", -400d));
		
		//mateus.setContas(new ArrayList<Conta>());
		mateus.getContas().add(Contas.get(0));
		mateus.getContas().add(Contas.get(1));
		//Larissa.setContas(new ArrayList<Conta>());
		Larissa.getContas().add(Contas.get(2));
		Larissa.getContas().add(Contas.get(3));
		//victor.setContas(new ArrayList<Conta>());
		victor.getContas().add(Contas.get(4));
		victor.getContas().add(Contas.get(5));
		
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.isAdimplente());
		}
	}

}
