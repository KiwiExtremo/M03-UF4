package bitllets;

public class Import {
	public static final int VALOR_5 = 5;
	public static final int VALOR_10 = 10;
	public static final int VALOR_20 = 20;
	public static final int MIDA_HISTORIAL = 10;

	private static int limit;

	private int bitllets5;
	private int bitllets10;
	private int bitllets20;

	private int[] historial;
	private int indexHistorial;

	public Import(int bitllets5, int bitllets10, int bitllets20) {
		super();
		this.bitllets5 = bitllets5 < 0 ? 0 : bitllets5; // compara si és menor a 0 i l'inicialitza a 0. Sino,
														// inicialitza al valor donat.
		this.bitllets10 = bitllets10 < 0 ? 0 : bitllets10; // compara si és menor a 0 i l'inicialitza a 0. Sino,
															// inicialitza al valor donat.
		this.bitllets20 = bitllets20 < 0 ? 0 : bitllets20; // compara si és menor a 0 i l'inicialitza a 0. Sino,
															// inicialitza al valor donat.

		indexHistorial = 0;

		historial = new int[MIDA_HISTORIAL];

		validaLimit();
		afegirHistorial();
	}

	public int getBitllets5() {
		return bitllets5;
	}

	public void setBitllets5(int bitllets5) {
		if (bitllets5 < 0) {
			bitllets5 = 0;
		}
		validaLimit();
		afegirHistorial();

		this.bitllets5 = bitllets5;
	}

	public int getBitllets10() {
		return bitllets10;
	}

	public void setBitllets10(int bitllets10) {
		if (bitllets10 < 0) {
			bitllets10 = 0;
		}
		validaLimit();
		afegirHistorial();

		this.bitllets10 = bitllets10;
	}

	public int getBitllets20() {
		return bitllets20;
	}

	public void setBitllets20(int bitllets20) {
		if (bitllets20 < 0) {
			bitllets20 = 0;
		}
		validaLimit();
		afegirHistorial();

		this.bitllets20 = bitllets20;
	}

	public static int getLimit() {
		return limit;
	}

	public static void setLimit(int limit) {
		if (limit >= 10) {
			Import.limit = limit;
		} else {
			Import.limit = 10;
		}
	}

	public int total() {
		int total;

		total = bitllets5 * VALOR_5 + bitllets10 * VALOR_10 + bitllets20 * VALOR_20;

		return total;
	}

	private void validaLimit() {
		if (bitllets5 + bitllets10 + bitllets20 > limit) {
			throw new RuntimeException();
		}
	}

	public void afegirHistorial() {
		if (indexHistorial >= MIDA_HISTORIAL) {
			return;
		}
		historial[indexHistorial++] = this.total();
	}

	public String mostrarHistorial() {
		String historialSencer = String.valueOf(historial[0]);

		for (int i = 1; i < historial.length; i++) {
			historialSencer += ", " + historial[i];
		}

		return historialSencer;
	}

	@Override
	public String toString() {
		int total = total();
		String string = String.format("%d,00€", total);

		string += " (" + bitllets20 + " bitllets de 20€, " + bitllets10 + " bitllets de 10€, " + bitllets5
				+ " bitllets de 5€)";

		return string;
	}
}
