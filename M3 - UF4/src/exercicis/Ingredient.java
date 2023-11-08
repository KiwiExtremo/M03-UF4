package exercicis;

/**
 * La classe ingredient representa l'ingredient d'un plat o recepta.
 * 
 * @author cfgs
 *
 */
public class Ingredient {
	private String nom;
	private double preu;
	private boolean Fruita;
	
	/**
	 * Constructor per crear nous ingredients
	 * 
	 * @param nom String amb nom de l'ingredient nou
	 * @param preu Double amb preu de l'ingredient nou
	 * @param Fruita Boolean sobre si l'ingredient nou és o no una fruita
	 */
	public Ingredient(String nom, double preu, boolean Fruita) {
		this.nom = nom;
		this.preu = preu;
		this.Fruita = Fruita;
	}
	
	/**
	 * Getter del nom de l'ingredient
	 * @return Retorna el nom de l'ingredient
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Setter del nom de l'ingredient (actualitzador)
	 * 
	 * @param nom Retorna el nou nom de l'ingredient
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Getter del preu de l'ingredient
	 * 
	 * @return Retorna el preu de l'ingredient
	 */
	public double getPreu() {
		return preu;
	}
	
	/**
	 * Setter del preu de l'ingredient (actualitzador)
	 * 
	 * @param preu Retorna el nou preu de l'ingredient
	 */
	public void setPreu(double preu) {
		this.preu = preu;
	}
	
	/**
	 * Getter de si l'ingredient és o no fruita
	 * 
	 * @return Retorna un true/false segons si és o no fruita
	 */
	public boolean isFruita() {
		return Fruita;
	}
	
	/**
	 * Actualitza si l'ingredient és o no fruita
	 * 
	 * @param esFruita Retorna el nou valor
	 */
	public void setFruita(boolean esFruita) {
		this.Fruita = esFruita;
	}
}
