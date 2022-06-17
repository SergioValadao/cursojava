package Classes;

public class SavingsAccount extends Conta {
	
	private Double interestRating;
	
	public SavingsAccount(){
		super();
	}

	public SavingsAccount(int numero, String nome, String holder, Double balance, Double interestRating) {
		super(numero, nome, holder, balance);
		this.interestRating = interestRating;
	}

	public Double getInterestRating() {
		return interestRating;
	}

	public void setInterestRating(Double interestRating) {
		this.interestRating = interestRating;
	}

	public void calculaJuros(double inter) {
		balance += balance * inter;
		
	}

	@Override
	public void retirada(double amount) {
		balance -= amount;
	}
	
	
	
}
