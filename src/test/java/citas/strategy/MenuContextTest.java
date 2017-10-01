package citas.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MenuContextTest {

	MenuContext menuContext;
	MenuContext menuContext2;

	@Before
	public void Before() {
		menuContext = new MenuContext();
		menuContext2 = new MenuContext();

	}

	@Test
	public void testMenuContext() {

		assertEquals(menuContext.getMenu(), menuContext.getMenu());
	}

	@Test
	public void testFregarCalderos() {
		assertEquals("Calderos limpios", menuContext.fregarCalderos());

	}

	@Test
	public void testEncenderFuego() {
		assertEquals("Fuego encendido", menuContext.encenderFuego());
	}

	@Test
	public void testActivarExtractor() {
		assertEquals("Extractor activado", menuContext.activarExtractor());
	}

	@Test
	public void testAñadirPlato() {
		CroquetasConcreteStrategy croquetas= new CroquetasConcreteStrategy();
		assertEquals(menuContext2.anadirPlato(croquetas), menuContext.anadirPlato(croquetas));

	}

}
