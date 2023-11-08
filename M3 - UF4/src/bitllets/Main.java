package bitllets;

public class Main {

	public static void main(String[] args) {
		Import.setLimit(10);

		Import prova = new Import(1, 3, 2);

		System.out.println(prova.total());

		System.out.println(prova.toString());

		prova.setBitllets10(-2);

		prova.setBitllets20(6);
		System.out.println("Se contaron 6 billetes de 20. En total suman " + 6 * Import.VALOR_20 + "€");

		System.out.println(prova.total());

		System.out.println(prova.mostrarHistorial());

	}

}
