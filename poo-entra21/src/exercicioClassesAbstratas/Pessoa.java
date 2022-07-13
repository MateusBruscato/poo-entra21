package exercicioClassesAbstratas;

import java.util.ArrayList;

public abstract class Pessoa {
	
	//Atributos
	private String nome;
	private boolean adimplente;
	private ArrayList<Conta> contas;
	

	public Pessoa() {
		super();
		this.adimplente = true;
		this.contas = new ArrayList<Conta>();
	}

	

	public Pessoa(String nome, ArrayList<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
		this.adimplente = true;
	}

	public double somaDosSaldos() {
		double somaSaldos = 0;
		for (Conta contaAtual: this.contas) {
			somaSaldos += contaAtual.getBalance();
		}
		return somaSaldos;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public ArrayList<Conta> getContas() {
		return contas;
	}



	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}



	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}
	
	public boolean getAdimplente() {
		return adimplente;
	}
	


	public abstract boolean isAdimplente();

}
