package Principal;

import entidade.Conta;

public class PrincipalLista1 {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta("123-7", "12345-6", 300d);
		System.out.printf("R$%.2f", conta1.getBalance());
		
		System.out.println();
		System.out.println("Total sacado: R$" + conta1.sacar(250));
		System.out.println("Saldo atual: R$" + conta1.getBalance());
		System.out.println("Total sacado: R$" + conta1.sacar(300));
		System.out.println("Saldo atual: R$" + conta1.getBalance());
		conta1.depositar(200);
		System.out.print("Saldo atual de: R$");
		System.out.printf("R$%.2f", conta1.getBalance());
		System.out.println();
		
		conta1.efetuarRendimento(0.5);
		System.out.println("Rendimento adicionado ao seu saldo.");

		System.out.printf("R$%.2f", conta1.getBalance());
		System.out.println();
		conta1.efetuarRendimento(0.8);
		System.out.println("Rendimento adicionado ao seu saldo.");
		System.out.printf("R$%.2f", conta1.getBalance());
		
	}

}
