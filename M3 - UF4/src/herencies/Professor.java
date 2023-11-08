package herencies;

public class Professor extends Persona {
	private String departament;

	public Professor(String dni, String nomCognoms, int edat, String departament) {
		super(dni, nomCognoms, edat);
		this.departament = departament;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}
	
}
