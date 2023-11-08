package exercicis;

import java.text.*;
import java.util.*;

public class Exercici27 {
	
	public static void main(String[] args) {
		// Data d'avui
		Date avui = new Date();
		
		// Formatar data d'avui
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", new Locale("CA", "ES"));
		System.out.println("La data d'avui és: " + sdf.format(avui));
		
		// 7 de desembre de 1975
		Calendar calendari = Calendar.getInstance();
		calendari.set(1975, 11, 07);
		
		sdf = new SimpleDateFormat("dd MMMM yy", new Locale("CA", "ES"));
		System.out.println("Data formatada: " + sdf.format(calendari.getTime()));
		
		sdf = new SimpleDateFormat("dd MMMM yy", new Locale("ES", "ES"));
		System.out.println("Data formatada (alternativa): " + sdf.format(calendari.getTime()));
	}

}
