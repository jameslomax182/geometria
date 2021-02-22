import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_JRLTest {

	@Test
	final void testArea() {
		//radio=7
		//radio=0
		//radio=-3
		int resultado1=0, resultado2=0, resultado3=0;
		
		Circulo_JRL circulo1 = new Circulo_JRL();
		
		resultado1=circulo1.area(7);
		resultado2=circulo1.area(0);
		resultado3=circulo1.area(-3);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
	
	}

	@Test
	final void testPerimetro() {
		//radio=7
		//radio=0
		//radio=-3
		int perimetro1=0, perimetro2=0, perimetro3=0;
				
		Circulo_JRL circulo2 = new Circulo_JRL();
				
		perimetro1=circulo2.area(7);
		perimetro2=circulo2.area(0);
		perimetro3=circulo2.area(-3);
		
		System.out.println(perimetro1);
		System.out.println(perimetro2);
		System.out.println(perimetro3);
		
	}

	@Test
	final void testCirculo_JRL() {
		fail("Not yet implemented");
	}

}
