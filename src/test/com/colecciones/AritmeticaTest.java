package test.com.colecciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.colecciones.persona.Aritmetica;

class AritmeticaTest {

	@Test
	void testSuma1() {
		Aritmetica ari= new Aritmetica();
		Integer resultado=ari.sumar(2, 2);
		assertEquals(resultado, 4);
		
		assertEquals(ari.sumar(0, 2), 2);
		assertEquals(ari.sumar(2, 0), 2);
		assertEquals(ari.sumar(0, 0), 0);
		
		
		
		
	}
	@Test
	public void testResta() {
		Aritmetica ari=new Aritmetica();
		Integer resultado=ari.restar(4, 2);
		assertEquals(resultado, 2);
		
		assertEquals(ari.restar(0, 0), 0);
		assertEquals(ari.restar(5, 6), 1);
		assertEquals(ari.restar(10, 5), 5);
	}

}
