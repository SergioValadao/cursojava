package Classes;

public class Conta {
	
	private int numero;
	private String nome;
	private String holder;
	protected Double balance;
	
	public Conta() {
		
	}
		
	public Conta(int numero, String nome, String holder, Double balance) {
		this.numero = numero;
		this.nome = nome;
		this.holder = holder;
		this.balance = balance;		//a variavel protect possibilita que as subclasses possam alterar o seu valor.
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
		
	public void retirada(double amount) {		
		balance -= amount + 5.0;		
	}
	
	public void deposito(double amount) {		
		balance += amount;		
	}

	@Override
	public String toString() {
		String resumo = "Numero da conta: " + String.valueOf(this.numero) + " Correntista: " + this.nome + " Holder: " + this.holder + " Saldo bancario:" + String.format("%.2f%n",this.balance); 
		return resumo;
	}
	
	

}
