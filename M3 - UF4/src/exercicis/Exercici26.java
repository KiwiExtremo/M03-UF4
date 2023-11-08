package exercicis;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Aquesta activitat serveix per practicar a crear taules amb formatació pròpia.
 * 
 * @author Ariel Gómez
 *
 */
public class Exercici26 {
	/**
	 * Ample de la columna 0
	 */
	public static final int W_COL0 = 5;
	
	/**
	 * Ample de la columna 1
	 */
	public static final int W_COL1 = 25;
	
	/**
	 * Ample de la columna 2
	 */
	public static final int W_COL2 = 10;
	
	/**
	 * Ample de la columna 3
	 */
	public static final int W_COL3 = 8;
	
	/**
	 * Espai entre columnes
	 */
	public static final int REPORT_GAP = 5;

	/**
	 * Escàner per poder llegir els valors introduits per l'usuari
	 */
	public static Scanner scan;
	
	/**
	 * Mètode principal on s'executarà tot el codi
	 * 
	 * @param args Ni idea
	 */
	public static void main(String[] args) {

		System.out.println(" - Exercici 26: llista d'ingredients per receptes -\n");

		// Primera llista
		String titol1 = "Macarrons a la carbonara";
		Ingredient[] ingredients1 = {new Ingredient("Macarrons", 5.1, false), new Ingredient("Crema de llet", 4, false), new Ingredient("Bacon", 3.2, false)};

		// Segona llista
		String titol2 = "Macedònia";
		Ingredient[] ingredients2 = {new Ingredient("Taronja", 1, true), new Ingredient("Pera", 1, true), new Ingredient("Pinya", 1.5, true), new Ingredient("Meló", 2, true)};

		DecimalFormat df = new DecimalFormat("##0.00");

		// Preparació de les llistes
		String llista1 = "";
		String llista2 = "";

		// Llista 1: impressió
		// Capçalera
		System.out.println(titol1 + ", preu: " + df.format(calcularTotal(ingredients1)) + "€");
		System.out.println("Ingredients:");

		// Titols
		llista1 += afegirLinia(0, "Nom", "Preu", "Fruita");

		// Línia divisoria
		llista1 += StringUtils.repeat("-", W_COL0 + W_COL1 + W_COL2 + W_COL3 + 3 * REPORT_GAP);
		llista1 += System.lineSeparator();

		// LListat d'items
		for (int i = 0; i < ingredients1.length; i++) {
			llista1 += afegirLinia(i + 1, ingredients1[i].getNom(), df.format(ingredients1[i].getPreu()) + "€", ingredients1[i].isFruita() ? "Si" : "No");
		}

		System.out.println(llista1);

		// Llista 2: impressió
		// Capçalera
		System.out.println(titol2 + ", preu: " + df.format(calcularTotal(ingredients2)) + "€");
		System.out.println("Ingredients:");

		// Titols
		llista2 += afegirLinia(0, "Nom", "Preu", "Fruita");

		// Línia divisoria
		llista2 += StringUtils.repeat("-", W_COL0 + W_COL1 + W_COL2 + W_COL3 + 3 * REPORT_GAP);
		llista2 += System.lineSeparator();

		// Llistat d'items
		for (int i = 0; i < ingredients2.length; i++) {
			llista2 += afegirLinia(i + 1, ingredients2[i].getNom(), df.format(ingredients2[i].getPreu()) + "€", ingredients2[i].isFruita() ? "Si" : "No");
		}

		System.out.println(llista2);
	}

	/**
	 * Mètode per afegir a l'string cada línia formatada per imprimir posteriorment.
	 * 
	 * @param index  index de la línia que printarem
	 * @param nom    Nom de l'ingredient de la línia a printar
	 * @param preu   Preu de l'ingredient de la línia a printar
	 * @param fruita Booleana sobre si l'ingredient de la línia és o no fruita
	 * 
	 * @return Retorna la línia formatada
	 */
	public static String afegirLinia(int index, String nom, String preu, String fruita) {
		String linia = "";

		linia += StringUtils.leftPad(index == 0 ? "# " : index + " -", W_COL0, " ");
		linia += StringUtils.repeat(" ", REPORT_GAP);
		linia += StringUtils.rightPad(StringUtils.abbreviate(nom, W_COL1), W_COL1, " ");
		linia += StringUtils.repeat(" ", REPORT_GAP);
		linia += StringUtils.leftPad(preu, W_COL2);
		linia += StringUtils.repeat(" ", REPORT_GAP);
		linia += StringUtils.center(fruita, W_COL3);

		linia += System.lineSeparator();

		return linia;
	}

	/**
	 * Mètode per calcular preu de la recepta a partir dels ingredients.
	 * 
	 * @param llista Vector amb tots els ingredients
	 * 
	 * @return Retorna la suma de tots els preus
	 */
	public static double calcularTotal(Ingredient[] llista) {
		double total = 0;

		for (Ingredient ingredient : llista) {
			total += ingredient.getPreu();
		}

		return total;
	}

}
