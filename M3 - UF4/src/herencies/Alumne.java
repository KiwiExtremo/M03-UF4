package herencies;

public class Alumne extends Persona{
	private double notaMitjana;

	public Alumne(String dni, String nomCognoms, int edat, double notaMitjana) {
		super(dni, nomCognoms, edat);
		this.notaMitjana = notaMitjana;
	}

	public double getNotaMitjana() {
		return notaMitjana;
	}

	public void setNotaMitjana(int notaMitjana) {
		this.notaMitjana = notaMitjana;
	}
}
