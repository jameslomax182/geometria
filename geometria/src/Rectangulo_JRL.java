/**
 * @author James Robert Lomax
 * @Java IES Severo Ochoa
 * @version 1.2
 */

public class Rectangulo_JRL extends FiguraGeometrica_JRL {
	private double l1;
	private double l2;
	
	
	/**
	 * @param tipoFigura El nombre de la figura
	 * @param lG Un lado de la figura
	 * @param lP Otro lado de la figura
	 * Este método recibe el tipo de figura y dos valores numéricos correspondientes
	 * a los lados, que se asignan a l1 y l2. 
	 */
	public Rectangulo_JRL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el area del rectángulo multiplicando los lados l1 y l2
	 * @return devuelve el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perímetro multiplicando cada lado por 2, y sumando los resultados.
	 * @return devuelve el resultado del perímetro.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
