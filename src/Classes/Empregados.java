package Classes;

public class Empregados {
	
	private int matricula;
	private String name;
	private int hours;
	private Double valorhora;
	
	public Empregados() {		
	}

	public Empregados(int matricula, String name, int hours, Double valorhora) {
		this.matricula = matricula;
		this.name = name;
		this.hours = hours;
		this.valorhora = valorhora;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Double getValorhora() {
		return valorhora;
	}

	public void setValorhora(Double valorhora) {
		this.valorhora = valorhora;
	}
	
	public double pagamento() {
		return this.hours * this.valorhora;
	}
	
}
