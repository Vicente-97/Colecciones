package test.com.colecciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.colecciones.persona.Persona;

class PersonaTest {

	@Test
	void testOrdenarLista() {
		List<Persona> personas= Persona.generarListaPersona();
		Persona.OrdenarListaPersona(personas);
		assertEquals(personas.get(0).getApellido(), "Azahar");
	
	}
	
	@Test
	public void testOrdenarListaVacia() {
		List<Persona> personas= Persona.generarListaPersona();
		Persona.OrdenarListaPersona(personas);
		personas.clear();
		assertEquals(personas.size(), 0);
	}
	
	@Test	
	public void testOrdenarListaNula() {
		assertEquals(Persona.OrdenarListaPersona(null), null);
		
	}
	
	public void testEsMayor18() {
		Persona p1= new Persona("manolo", "juan", LocalDate.now().minusYears(18));
	}
	
	public void testEsMayor17() {
		Persona p2= new Persona("manolo", "juan", LocalDate.now().minusYears(17));
	}
	
	public void testEsMayor20() {
		Persona p3= new Persona("manolo", "juan", LocalDate.now().minusYears(20));
	}
	
}
