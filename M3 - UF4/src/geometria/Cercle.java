package geometria;

public class Cercle implements Printable {
    private Punt centre;
    private int radi;
   
    public Cercle(Punt centre, int radi) {
    	super();
    	this.centre = centre;
    	this.radi = radi;
    }
    
    public Cercle(int x, int y, int radi) {
    	super();
    	this.centre = new Punt(x, y);
    	this.radi = radi;
    }

    public Punt getCentre() {
        return centre;
    }
    public void setCentre(Punt centre) {
        this.centre = centre;
    }
    public int getRadi() {
        return radi;
    }
    public void setRadi(int radi) {
        this.radi = radi;
    }
	@Override
	public char[][] actualitzar(char[][] llenç, char lletra) {
		Punt rDalt = new Punt(centre.getX(), centre.getY() + radi);
		Punt rBaix = new Punt(centre.getX(), centre.getY() - radi);
		Punt rDret = new Punt(centre.getX() + radi, centre.getY());
		Punt rEsq = new Punt(centre.getX() - radi, centre.getY());
		
		centre.actualitzar(llenç, lletra);
		rDalt.actualitzar(llenç, 'R');
		rBaix.actualitzar(llenç, 'R');
		rDret.actualitzar(llenç, 'R');
		rEsq.actualitzar(llenç, 'R');
		
		return llenç;
	}
}