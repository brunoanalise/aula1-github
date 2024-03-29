package entities;

public class ContaBancaria {
	
	private int number;
	private String holder;
	private double balance;
	
	public ContaBancaria( int number, String holder) {
		this.number = number;
		this.holder = holder;
	
	}
	 
	public ContaBancaria(int number, String holder, double inicialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit (inicialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withDraw (double amount) {
		balance -= amount + 5.0;
	}
	public String toString () {
		return "Account " 
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", getBalance());
	
	}
}
