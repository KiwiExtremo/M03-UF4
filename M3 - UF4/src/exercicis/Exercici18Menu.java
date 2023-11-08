package exercicis;

import java.util.Scanner;

public class Exercici18Menu {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int opcio = -1;

		System.out.print("Bon dia. Benvingut a l'exercici 18.\n\nPer començar, introdueix un text: ");

		String textOriginal = scan.nextLine();

		while (opcio != 0) {
			System.out.println("\n - Menú principal:");
			System.out.println("1-\tMostrar la longitud del text.");
			System.out.println("2-\tIntroduir un nou text i comparar si és igual a l'anterior.");
			System.out.println("3-\tMostrar un tros de text.");
			System.out.println("0-\tSortir del programa.");
			System.out.print("\n    - Selecciona què fer: ");

			opcio = scan.nextInt();
			scan.nextLine();

			switch (opcio) {
			case 1:
				System.out.println("    - La longitud del text és de " + longitudText(textOriginal) + " caràcters.");
				break;

			case 2:
				System.out.print("    - Introdueix el nou text per comparar: ");
				String textNou = scan.nextLine();

				if (comparadorTextos(textOriginal, textNou)) {
					System.out.println("        - Els 2 textos són iguals.");
				} else {
					System.out.println("        - Els 2 textos són diferents.");
				}
				break;

			case 3:
				System.out.print("    - Introdueix el número a partir del que vols mostrar els caràrcters: ");
				int[] porcio = { 0, 0 };

				porcio[0] = scan.nextInt();
				scan.nextLine();

				System.out.print("    - Introdueix el número final per mostrar els caràcters: ");
				porcio[1] = scan.nextInt();
				scan.nextLine();

				if (porcio[0] >= 0 && porcio[1] < textOriginal.length() && porcio[0] <= porcio[1]) {
					System.out.println("        - El tros de text és: \"" + trosText(textOriginal, porcio) + "\".");
				} else {
					System.out.println("        - L'interval introduït no és correcte.");
				}

				break;

			case 0:
				System.out.println("    - Adéu! Fins una altra.");
				break;

			default:
				System.out.println("    - Opció incorrecta. Torna a intentar-ho.");
				break;
			}
		}
	}

	public static int longitudText(String text) {
		return text.length();
	}

	public static boolean comparadorTextos(String textOriginal, String textNou) {
		return textOriginal.equals(textNou);
	}

	public static String trosText(String text, int[] porcio) {
		String trosText = text.substring(porcio[0], porcio[1] + 1);

		return trosText;
	}
}
