package geometria;

import java.util.Scanner;

public class ProvarFigures {
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int eixX;
		int eixY;
		
		// Matriu base (llenç)
		System.out.println("- Creació de la matriu -");
		System.out.print("  Introdueix el valor de la matriu (separades per espai): ");
		eixX = scan.nextInt();
		eixY = scan.nextInt();
		
		char[][] taulell = new char[eixX][eixY];
		
		taulell = initTaulell(taulell);
		
		// Crear punts
		System.out.println("\n- Creació d'un punt -");
		System.out.print("  Introdueix les coordenades del punt (separades per espai): ");
		int pX = scan.nextInt();
		int pY = scan.nextInt();
		
		Punt p1 = new Punt(pX, pY);
		
		taulell = p1.actualitzar(taulell, 'X');
		
		printarTaulell(taulell);
		
		// Crear cercles
		System.out.println("\n- Creació d'un cercle -");
		
		// Opció de netejar el llenç
		System.out.print("    Vols netejar el taulell? (S/N): ");
		scan.nextLine(); // Sanejar l'intro
		String neteja = scan.nextLine();
		
		if (neteja.equals("s") || neteja.equals("S")) {
			initTaulell(taulell);
		}
		
		System.out.print("  Introdueix les coordenades del centre del cercle (separades per espai): ");
		int cX = scan.nextInt();
		int cY = scan.nextInt();
		
		System.out.print("  Introdueix el radi del cercle: ");
		int cRadi = scan.nextInt();
		
		Punt cCentre = new Punt(cX, cY);
		Cercle c1 = new Cercle(cCentre, cRadi);
		// Cercle c1 = new Cercle(cX, cY, cRadi); // Forma alternativa de crear el cercle
		
		taulell = c1.actualitzar(taulell, 'C');
		
		printarTaulell(taulell);
		
		// Crear triangles
		System.out.println("\n- Creació d'un triangle -");
		
		// Opció de netejar el llenç
		System.out.print("    Vols netejar el taulell? (S/N): ");
		scan.nextLine(); // Sanejar l'intro
		neteja = scan.nextLine();
		
		if (neteja.equals("s") || neteja.equals("S")) {
			initTaulell(taulell);
		}
		
		System.out.print("  Introdueix les coordenades del primer vertex del triangle: ");
		int v1X = scan.nextInt();
		int v1Y = scan.nextInt();
		
		Punt[] punts = new Punt[3];
		
		Punt v1 = new Punt(v1X, v1Y);
		punts[0] = v1;
		
		System.out.print("  Introdueix les coordenades del segon vertex del triangle: ");
		int v2X = scan.nextInt();
		int v2Y = scan.nextInt();
		
		Punt v2 = new Punt(v2X, v2Y);
		punts[1] = v2;
		
		System.out.print("  Introdueix les coordenades del tercer vertex del triangle: ");
		int v3X = scan.nextInt();
		int v3Y = scan.nextInt();
		
		Punt v3 = new Punt(v3X, v3Y);
		punts[2] = v3;	

		Triangle t1 = new Triangle(punts);
		
		/* Triangle t1 = new Triangle();
		* t1.setVertex(v1, 0);
		* t1.setVertex(v2, 0);
		* t1.setVertex(v3, 0);
		*/
		
		taulell = t1.actualitzar(taulell, 'T');
		
		printarTaulell(taulell);
	}
	
	public static char[][] initTaulell(char[][] taulell) {
		for (int i = taulell.length - 1; i >= 0; i--) {
			for (int j = 0; j < taulell[0].length; j++) {
				taulell[i][j] = '·';
			}
		}
		return taulell;
	}
	
	public static void printarTaulell(char[][] taulell) {
		for (int i = taulell.length - 1; i >= 0; i--) {
			for (int j = 0; j < taulell[0].length; j++) {
				System.out.print("  " + taulell[i][j]);
			}
			System.out.println("");
		}
	}
}
