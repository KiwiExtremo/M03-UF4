package geometria;

public class Triangle implements Printable {
    private Punt[] vertex;

    // Responsabilitat externa que el vector sigui de mida 3 (vertexs). Arriscat 
    public Triangle(Punt[] vertex) { 
        this.vertex = vertex;
    }
   
    public Triangle() { 
        this.vertex = new Punt[3];
    }

    public Punt[] getVertex() {
        return vertex;
    }

    // index entre 0 i 2
    public void setVertex(Punt vertex, int index) {
        this.vertex[index] = vertex;
    }

	@Override
	public char[][] actualitzar(char[][] llenç, char lletra) {
		vertex[0].actualitzar(llenç, lletra);
		vertex[1].actualitzar(llenç, lletra);
		vertex[2].actualitzar(llenç, lletra);

		return llenç;
	}
}