package exercicioClassesAbstratas;

public class Conta {
	
	private String agencyNumber;
	private String accountNumber;
	private Double balance;
	
	
	public Conta(String agencyNumber, String accountNumber, Double balance) {
		super();
		this.agencyNumber = agencyNumber;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double sacar(double amount) {
		if(amount < 0)
		{
			System.out.println("Não pode ser sacado um valor negativo!");
			return 0;
		}
		this.balance = this.balance - amount;
		return balance;
	}
	
	public void depositar(double amount) {
		this.balance += amount;
	}
	
	public void efetuarRendimento(double amount) {
		this.balance *= (1 + (amount/100));
	}
	
	public String getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return  balance;
	}


}
