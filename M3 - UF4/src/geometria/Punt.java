package geometria;

public class Punt implements Printable {
    private int x;
    private int y;
   
    public Punt(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
	@Override
	public char[][] actualitzar(char[][] llenç, char lletra) {
		if (llenç == null) return llenç; // No actualitzem el taulell
		
		if (x < 0 || x >= llenç[0].length || y < 0 || y >= llenç.length) return llenç; // No actualitzem el taulell
		
		llenç[y][x] = lletra; // Actualitzem el taulell
		
		return llenç;
	}
}
