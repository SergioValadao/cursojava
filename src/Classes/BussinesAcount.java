package Classes;

public class BussinesAcount extends Conta {

	private Double loanLimit;	
	
	public BussinesAcount() {
		super();
	}
	
	public BussinesAcount(int numero, String nome, String holder, Double balance, Double loanLimit) {
		super(numero, nome, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	@Override
	public void retirada(double amount) {
		super.retirada(amount);
		balance -= 2.0;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			this.balance += amount-10;
		}
	}		
}
