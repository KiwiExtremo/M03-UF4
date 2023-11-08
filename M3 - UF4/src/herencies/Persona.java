package herencies;

public class Persona {
	protected String dni;
	protected String nomCognoms;
	protected int edat;
	
	public Persona(String dni, String nomCognoms, int edat) {
		super();
		this.dni = dni;
		this.nomCognoms = nomCognoms;
		this.edat = edat;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNomCognoms() {
		return nomCognoms;
	}
	public void setNomCognoms(String nomCognoms) {
		this.nomCognoms = nomCognoms;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
}
