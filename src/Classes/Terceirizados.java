package Classes;

public class Terceirizados extends Empregados {

	private double adicional;
	
	public Terceirizados() {
		super();
	}
	
	public Terceirizados(int matricula, String name, int hours, Double valorhora, double adicional) {
		super(matricula, name, hours, valorhora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double pagamento() { 
		return super.pagamento() + this.adicional * 1.10;
	}

	
	
}
