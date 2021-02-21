/*
 * @author James Robert Lomax
 * versi�n 1.2
 */

public class Rectangulo_JRL extends FiguraGeometrica_JRL {
	private double l1;
	private double l2;
	
	
	/*
	 * Este m�todo recibe el tipo de figura y dos valores num�ricos correspondientes
	 * a los lados, que se asignan a l1 y l2. 
	 */
	public Rectangulo_JRL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/*
	 * Calcula el area del rect�ngulo multiplicando los lados l1 y l2, y devuelve el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/*
	 * Calcula el per�metro multiplicando cada lado por 2, y sumando los resultados.
	 * Devuelve el resultado del per�metro.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
