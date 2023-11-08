package exercicis;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicis {
	private static Scanner scan;

	public static void main(String[] args) {
		int i = 0;

		scan = new Scanner(System.in);

//		// Exercici 8
//		System.out.println("Exercici 8: Mostra el següent text formatat per pantalla:");
//		System.out.println(exercici8());
//		System.out.println("\n\n");
//
//		// Exercici 9
//		System.out.println("Exercici 9: Crea una funció que retorni la suma dels elements d’un vector d’enters.");
//		System.out.print("Introdueix la longitud del vector: ");
//		int longVec = scan.nextInt();
//
//		int[] vectorEx9 = lectorNumeros(longVec);
//
//		System.out.println(exercici9(vectorEx9));
//		System.out.println("\n\n");
//
//		// Exercici 10
//		System.out.println(
//				"Exercici 10: Escriu un programa que llegeixi un vector de 10 enters i a continuació digui si algun valor es repeteix o no (Cerca).");
//
//		int[] vectorEx10 = lectorNumeros(10);
//
//		System.out.println(exercici10(vectorEx10));
//		System.out.println("\n\n");
//
//		// Exercici 11
//		System.out.println(
//				"Exercici 11: Escriu un programa que a partir d'un vector d'enters indiqui si està ordenat o no.");
//		System.out.print("Introdueix la longitud del vector: ");
//
//		longVec = scan.nextInt();
//
//		int[] vectorEx11 = lectorNumeros(longVec);
//
//		System.out.println(exercici11(vectorEx11));
//		System.out.println("\n\n");
//
//		// Exercici 12
//		System.out.println(
//				"Exercici 12: Escriu un programa que a partir d'un vector d'enters calculi el nombre de parells i de senars que té.");
//		System.out.print("Introdueix la longitud del vector: ");
//
//		longVec = scan.nextInt();
//
//		int[] vectorEx12 = lectorNumeros(longVec);
//
//		int[] respuesta = exercici12(vectorEx12);
//
//		System.out.println("Hi ha " + respuesta[0] + " nombres parells i " + respuesta[1] + " nombres senars.");
//		System.out.println("\n\n");
//
		// Exercici 13
		System.out.println(
				"Exercici 13: escriu un programa que llegeixi un vector de 10 cadenes de text (inicialitza el vector com vulguis) i a continuació mostri quina és la més llarga i la seva longitud.");

		String[] vectorEx13 = lectorPalabras(10);

		exercici13(vectorEx13);
		System.out.println("\n\n");

		// Exercici 14

		System.out.println("Exercici 14: Crea una acció que converteixi un vector d’enters en un vector d’Strings.");
		System.out.print("Introdueix la longitud del vector: ");

		int longVec = scan.nextInt();

		int[] vectorEx14 = lectorNumeros(longVec);

		String[] answer = new String[longVec];

		exercici14(vectorEx14, answer);

		System.out.println("El vector d'strings és: " + Arrays.toString(answer) + ".");
		System.out.println("\n\n");

		// Exercici 18

		System.out.println(
				"Exercici 18: Escriu un programa amb un petit menú que llegeixi un text qualsevol i permeti a l’usuari fer les següents opcions");
		System.out.println();

		scan.close();
	}

	public static int[] lectorNumeros(int longVec) {

		int[] vector = new int[longVec];

		for (int i = 0; i < vector.length; i++) {
			System.out.print("Introdueix un valor: ");
			vector[i] = scan.nextInt();
		}

		return vector;
	}

	public static String[] lectorPalabras(int longVec) {
		String[] vector = new String[longVec];

		for (int i = 0; i < vector.length; i++) {
			System.out.print("Introdueix un string: ");
			vector[i] = scan.nextLine();
		}

		return vector;
	}

	public static String exercici8() {

		String text;

		text = "\"Aquest és un text ‘exemple’\nDe l’exercici: \t 12\"";

		return (text);
	}

	public static int exercici9(int[] vector) {
		int suma = 0;

		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}

		// for (int valor : vector) suma += valor; És un for each que permet recorrer el
		// vector ràpidament en casos en els que la "i" només s'utilitza per passar pel
		// vector.
		return suma;
	}

	public static boolean exercici10(int[] vector) {

		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[i] == vector[j]) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean exercici11(int[] vector) {
		int i = 0;

		if (vector[i] < vector[vector.length - 1]) {
			for (i = 0; i < vector.length - 1; i++) {
				if (vector[i] > vector[i + 1]) {
					return false;
				}
			}
		} else {
			for (i = 0; i > vector.length; i++) {
				if (vector[i] < vector[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[] exercici12(int[] vector) {
		int[] pairs = { 0, 0 };

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				pairs[0]++;
			} else {
				pairs[1]++;
			}
		}

		return pairs;
	}

	public static void exercici13(String[] vector) {
		String longWord = vector[0];
		int longSize = longWord.length();

		for (int i = 1; i < vector.length; i++) {
			if (longWord.length() < vector[i].length()) {
				longWord = vector[i];
				longSize = longWord.length();
			} else if (longWord.length() == vector[i].length()) {
				if (longWord.compareTo(vector[i]) < 0) {
					longWord = vector[i];
				}
			}
		}

		System.out.println("La paraula més llarga és " + longWord + " i té " + longSize + " caràcters.");
	}

	public static void exercici14(int[] vector, String[] strings) {

		for (int i = 0; i < vector.length; i++) {
			strings[i] = String.valueOf(vector[i]);
		}
	}

	public static void exercici18() {

	}
}
