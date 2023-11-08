package geometria;

public class Poligon implements Printable {
    private static final int MAX = 10;
    private int top;
    private Punt[] punts;

    public Poligon() {
        super();
        this.punts = new Punt[MAX];
        this.top = 0;
    }
   
    // Afegir al final. Vigilar top >= this.punts.length
    public void addPunt(Punt punt) {
        this.punts[top] = punt;
        this.top++;
    }
   
    public Punt getPunt(int index) {
        return this.punts[index];
    }

	@Override
	public char[][] actualitzar(char[][] llenç, char lletra) {
		
		return null;
	}
}